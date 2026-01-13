/**
 * 
 */
package module_3_string;

/**
 * 
 */
public interface JavaApplication {
    public static void execute() {
    	String s1="java";
    	System.out.println(s1);
    	String s2=new String("java");
    	System.out.println(s2);
    	System.out.println(s1.equals(s2));
    	System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
    	System.out.println();
    	StringBuffer f1=new StringBuffer("java");
    	System.out.println(f1);
    	StringBuffer f2=new StringBuffer("java");
    	System.out.println(f1);
    	System.out.println(f1.equals(f2));
    	System.out.println(f1.hashCode());
    	System.out.println(f2.hashCode());
    	System.out.println();
    	StringBuilder f11=new StringBuilder("java");
    	System.out.println(f11);
    	StringBuilder f22=new StringBuilder("java");
    	System.out.println(f11);
    	System.out.println(f11.equals(f22));
    	System.out.println(f11.hashCode());
    	System.out.println(f22.hashCode());
    	
    }
    
}
