package testprep;
import java.util.*;

public class testprep{
	 
private String attr;
 
public testprep(String attr){
    this.attr = attr; 
}

public static void main(String[] args){
	testprep mC1 = new testprep("10");
	testprep mC2 = new testprep("10");
   String str1 = new String ("20");
   String str2 = new String ("20"); 


    HashSet<Object> hs = new HashSet<Object>();
    hs.add(mC1);
    hs.add(mC2);
    hs.add(str1);
    hs.add(str2);

   System.out.println(hs.size()); 
 
} 
 
}

