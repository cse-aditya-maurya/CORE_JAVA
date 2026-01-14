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
	
	public static void execute3() {
		StringBuffer f1=new StringBuffer();
		f1.insert(0, "java");
		System.out.println(f1);
		f1.setCharAt(0, 'J');
		System.out.println(f1);
		f1.deleteCharAt(2);
		System.out.println(f1);
		
		
				
	}
	public static void main(String[] args) {
	           execution1();
	           execute2();
	           execute3();
            
	}

}


/*WAP to check whether a given String is palindrome or not */
