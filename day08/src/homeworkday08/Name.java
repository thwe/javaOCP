package homeworkday08;

public class Name {

	public static void main(String[] args){
		
		String vname = args[0];
		String nname = args[1];
		String name = vname + " " +nname;
		vname="";
		nname="";
		
			
			for (int i = 0; i < name.length(); i++) {
				
				if (i < name.indexOf(" ")) {
					vname=vname.concat(String.valueOf(name.charAt(i)));
				}
				else if (i > name.indexOf(" ")) {
					nname=nname.concat(String.valueOf(name.charAt(i)));
				}
				
				}
		
			
		int lVname = vname.length();
		int lNname = nname.length();
		int lName = lVname + lNname;
		String kuerzel = String.valueOf(vname.charAt(0)) + String.valueOf(nname.charAt(0));
				
		System.out.print("Der volle Name lautet: " + String.valueOf(name) +"\n" +"Die Länge des Vornamens beträgt: " +lVname + "\n" +"Die Länge des Nachnamens beträgt: " +lNname +"\n" +"Die volle Länge des Namens beträgt: " + lName +" Buchstaben \n" + "Das Kürzel lautet: " + kuerzel) ;
		
			}
	
	
	
	
	
			
			/*
			int index= name.indexOf(" ");
			System.out.println("Leerzeichen an Stelle "+ index);
			subVname=name.substring(0, index);
			subNname=name.substring(index+1, name.length());
			int lVname=subVname.length();
			int lNname=subNname.length(); 
			
			
			String ausgabe = "TeilString Vorname: " +subVname +" Länge Vorname:  " +lVname +" TeilString Nachname: " +subNname +" Länge Nachname:  " +lNname + " Länge Vor- und Nachname: " +(lVname+lNname);
			//System.out.print(ausgabe);
			
			
			String str = String.valueOf(vname.charAt(0));
			System.out.println(str);
			
			 */
			
		
}

	
	
	
	

