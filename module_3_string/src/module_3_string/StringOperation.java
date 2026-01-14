/**
 * 
 */
package module_3_string;

/**
 * 
 */
public class StringOperation {

	/**
	 * @param args
	 */
	
	public static void execution1() {
		String s1="09AZaz";
		System.out.println(s1.length());
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i)+" "+s1.codePointAt(i));
		}
	}
	
	public static void execute2() {
		String s1="core";
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3="Java";
		
		System.out.println(s3);
		String s4=s3.toLowerCase();
		System.out.println(s4);
		System.out.println(s3==s4);
		
		
		
				
	}
	public static void main(String[] args) {
	           execution1();
	           execute2();

	          String s = "";
	   		for(int i=0; i<1000; i++) {
	   		    s = s.concat("a");
	   		    System.out.println(s);
	   		}
	}

}
