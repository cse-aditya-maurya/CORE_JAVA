/**
 * 
 */
package module_3_string;
import java.util.Scanner;

/**
 * 
 */
/* Store and display the data as follows:
i)digits as a char (0-9)
ii)UpperCase Alphabet
iii)LowerCase alphabet 
iv)Days of a week
v)Months of a year
vi)Direction of compass

*/
public class StringQuestion {

	public static void execution1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str1=sc.nextLine();
		System.out.print("Digits is: ");
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		System.out.print("LowerCase is: ");
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(Character.isLowerCase(ch)) {
			System.out.print(ch);
		}
		}
		System.out.println();
	
		
		System.out.print("UpperCase is: ");
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(Character.isUpperCase(ch)) {
			System.out.print(ch);
		}
		}
		System.out.println();
		
		
    
	}
	
	 static void displayArray(String[] array) {
	        for (String s : array) {
	            System.out.print(s+", ");
	        }
	    }
	
	public static void execution2() {
		  String[] days = {
		            "Sunday", "Monday", "Tuesday", "Wednesday",
		            "Thursday", "Friday", "Saturday"
		     };
		  
		   String[] months = {
		            "January", "February", "March", "April", "May", "June",
		            "July", "August", "September", "October", "November", "December"
		        };

		      
		   String[] directions = {
		            "North", "South", "East", "West",
		            "North-East", "North-West", "South-East", "South-West"
		       };
		   
		   System.out.println("\nDays of the Week:");
	        displayArray(days);

	        System.out.println("\nMonths of the Year:");
	        displayArray(months);

	        System.out.println("\nCompass Directions:");
	        displayArray(directions);
		   
		        
		    
		  
	}

}
