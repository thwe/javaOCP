package others_homeworkday09;

public class Hwang_LetterSwapper {

	public static void main(String[] args) {
		if (args.length > 0) {
				String s = args[0];
				String sencrypt = "";
				for (int i = 0; i < s.length();i+=2) {
					if (i+1 < s.length()){
						sencrypt += s.charAt(i+1);
					}
					sencrypt += s.charAt(i);
				}
				System.out.println(sencrypt);
		}
	}
}
