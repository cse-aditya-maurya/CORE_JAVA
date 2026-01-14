package module_3_string;
import java.util.*;
public class Palindrome {
      public static void palindrome() {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter String: ");
    	  String s1=sc.nextLine();
    	  StringBuffer st=new StringBuffer();
    	  for(int i=s1.length()-1;i>=0;i--) {
    		  char ch=s1.charAt(i);
    		  st.append(ch);
    	  }
    	  if(s1.equals(st.toString())) {
    		  System.out.println("Palindrome");
    	  }
    	  else {
    		  System.out.println("Not palindrome");
    	  }
    	 
    	  
      }
      
      public static void palindrome1() {
    	String org="MADAM";
    	String rev="";
    	char[] array=org.toCharArray();
    	for (int i=array.length-1;i>=0;i--) {
			rev=rev+array[i];
		}
    	if(org.equals(rev)) {
    		System.out.println("Palindrome");
    	}
    	else {
  		  System.out.println("Not palindrome");
  	  }
    	
    	 
    	  
      }
      public static void StringOperaation() {
    	  String s1="Corejava";
    	  String s2=s1.substring(0,4).toUpperCase();
    	  String s3=s1.substring(4,8);
    	  
    	  StringBuffer s4=new StringBuffer(s3);
    	  
    	  s3=s4.reverse().toString();
    	  String s5=s3+s2;
    	  System.out.println(s5);
    	  
    	  
    	 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		palindrome();
//		palindrome1();
		StringOperaation();

	}

}
