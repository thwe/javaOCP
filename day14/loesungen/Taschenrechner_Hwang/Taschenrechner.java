import java.util.Scanner;

public class Taschenrechner {

	public static boolean DEBUG = true;
	public static void main(String[] args) {
		Taschenrechner taschenrechner = new Taschenrechner();
	//	Scanner scanner = new Scanner (System.in);
	//	String completeTerm = scanner.nextLine();
		
		String completeTerm;// = "-100 % (-20 * (10-9) + 1)";
		completeTerm = "100 - (5 - 10) - (10 -5) + 123 - 123 + 5555";
		
		//completeTerm = "123456789 + 987654321";
		if (taschenrechner.verifyInput(completeTerm)) {
			String ergebnis = taschenrechner.calculateBigInt (completeTerm);
			System.out.println(completeTerm + " = " + ergebnis);
		}
		else 
			System.out.println("Eingabe war nicht korrekt");
	}
	/**
	 * checks wheter input is a valid term
	 * @param completeTerm
	 * @return
	 */
	public boolean verifyInput (String completeTerm) { //geht besser mit Regulären Ausdrücken
		for (int i = 0; i < completeTerm.length();i++) {
			boolean valid = false; 
			char c = completeTerm.charAt(i);
			valid = (c >= '0' && c <= '9') || c == '+' ||
						c == '-' || c == '/' || c == '*' || c == '%' || c == ' ' 
						|| c == '(' || c == ')';
			if (!valid)
				return false;
				
		}
		return true;
	}
	
	/**
	 * calculates a (complete) term with class BigInteger  
	 * @param term
	 * @return
	 */
	public String calculateBigInt (String term) {
		BigInteger.setNegativesign('~');
		term = term.replaceAll(" ", "");
		BigInteger result = calculateTerms(term);
		BigInteger.setNegativesign('-');
		return result.toString();
	}
	
	/**
	 * calculates a term 
	 * @param term
	 * @return
	 */
	private BigInteger calculateTerms (String term) {
		BigInteger result = new BigInteger(0);
		while (term.contains("(")) {
			//wenn klammer dann rufe rekursiv die Methode mit dem Teilausdruck 
			int lindex = term.indexOf("(");
			int rindex = getRightParenthis (term,lindex);
			String subterm = term.substring(lindex+1, rindex);
			if (DEBUG)
				System.out.println("rekursion mit " + subterm);
			result = calculateTerms(subterm); //hier der rekursive Aufruf
			term = term.replace("("+subterm+")", result.toString()); //Ersetzung des Terms mit dem Ergebnis
			if (DEBUG)
				System.out.println("rekursion raus mit " + term);
			
		}
		int pos  = findFirstOperation(term);//Suche erste Operation + - / * %
		if (pos == 0 && term.charAt(0) == '~' && (findFirstOperation(term.substring(1)) == -1)) {
			//Wenn nur noch eine Zahl oder negativ dann ist das Ergebnis die Zahl
			result = new BigInteger(term);
		}
		else {
			while (pos != term.length() && pos != -1) {
				String subterm = getSubTerm (term,pos); //operand operator 2.operand
				result = calculateSubTerm (subterm,term.charAt(pos)); //Berechnung
				term = term.replace(subterm, result.toString()); //Ersetzung des Terms mit dem Ergebnis
				if (DEBUG) {
					System.out.println(subterm + " = " + result.toString());
					//System.out.println(term);
				}
				pos  = findFirstOperation(term);
				if (subterm.compareTo(term) == 0)
					break;
			}
		}
		return result;
	}
	/**
	 * Hier werden Klammern gezählt und damit der passende schließende Klammer gesucht und die Position zurückgegeben
	 * @param term
	 * @param pos
	 * @return
	 */
	private int getRightParenthis (String term,int pos) {
		int counter = 1; 
		int i = pos + 1;
		while (counter != 0) {
			if (term.charAt(i) == '(')
				counter++;
			else if (term.charAt(i) == ')') 
				counter--;
			i++;
			if (i == term.length() && counter != 0) {
				System.exit(-1);//TODO Throw Exception
			}
		}
		return i-1;
	}
	
	/**
	 * Hier die Berechnung von Operand Operator Operand
	 * @param subterm
	 * @param operation
	 * @return
	 */
	private BigInteger calculateSubTerm (String subterm,char operation) {
		String leftzahl = subterm.substring(0,subterm.indexOf(operation)).trim();
		String rightzahl = subterm.substring(subterm.indexOf(operation)+1).trim();
		BigInteger left = new BigInteger(leftzahl);
		BigInteger right = new BigInteger(rightzahl);
		switch (operation) {
		case '+' : 
			left.add(right);
			break;
		case '-' : 
			left.substract(right);
			break;
		case '*':
			left.multiply(right);
			break;
		case '/':
			left = left.div(right);
			break;
		case '%':
			left = left.modulo(right);
			break;
		default : 
			System.out.println("Operation nicht erkannt");
			System.exit(-1);
		}
		return left;
	}
	
	private int findFirstOperation (String term) {
		int minPos = term.length();
		int pos = term.indexOf('*');
		if (pos != -1 && pos < minPos)
			minPos = pos;
		pos = term.indexOf('/');
		if (pos != -1 && pos < minPos)
			minPos = pos;
		pos = term.indexOf('%');
		if (pos != -1 && pos < minPos)
			minPos = pos;
		if (minPos != term.length())
			return minPos;
		pos = term.indexOf('+');
		if (pos != -1 && pos < minPos)
			minPos = pos;
		pos = term.indexOf('-');
		if (pos != -1 && pos < minPos)
			minPos = pos;
		return minPos; 
	}
	
	private String getSubTerm (String term,int pos) {
		int leftpos = 0;
		int lpos;
		lpos = term.lastIndexOf('+', pos-1);
		if (lpos != -1 &&lpos > leftpos)
			leftpos = lpos+1;
		lpos = term.lastIndexOf('-', pos-1);
		if (lpos != -1 && lpos > leftpos)
			leftpos = lpos+1;
		lpos = term.lastIndexOf('/', pos-1);
		if (lpos != -1 && lpos > leftpos)
			leftpos = lpos+1;
		lpos = term.lastIndexOf('*', pos-1);
		if (lpos != -1 && lpos > leftpos)
			leftpos = lpos+1;
		lpos = term.lastIndexOf('%', pos-1);
		if (lpos != -1 && lpos > leftpos)
			leftpos = lpos+1;
		
		int rightpos = term.length();
		int rpos;
		rpos = term.indexOf('+', pos+1);
		if (rpos != -1 && rpos < rightpos)
			rightpos = rpos;
		rpos = term.indexOf('-', pos+1);
		if (rpos != -1 && rpos < rightpos)
			rightpos = rpos;
		rpos = term.indexOf('/', pos+1);
		if (rpos != -1 && rpos < rightpos)
			rightpos = rpos;
		rpos = term.indexOf('*', pos+1);
		if (rpos != -1 && rpos < rightpos)
			rightpos = rpos;
		rpos = term.indexOf('%', pos+1);
		if (rpos != -1 && rpos < rightpos)
			rightpos = rpos;
		return term.substring(leftpos, rightpos);
	}

}
