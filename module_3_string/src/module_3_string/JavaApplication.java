/**
 * 
 */
package module_3_string;

/**
 * 
 */
public interface JavaApplication {
    public static void execute1() {
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
    public static void execute2() {
    	String f1="ja";
    	System.out.println(f1);
    	String f2="va";
    	System.out.println(f2);
    	String f3=f1+f2;
    	System.out.println(f3);
    	System.out.println(f1==f2);
    	System.out.println(f1==f3);
    	System.out.println(f2==f3);
    	
    	
    }
    public static void execute3() {
    	StringBuffer f1=new StringBuffer("ja");
    	System.out.println(f1);
    	StringBuffer  f2=new StringBuffer("va");
    	System.out.println(f2);
    	StringBuffer  f3=f1.append(f2);
    	System.out.println(f3);
    	System.out.println(f1==f2);
    	System.out.println(f1==f3);
    	System.out.println(f2==f3);
    	
    	
    	
    }
    String s1="java";
    StringBuffer f1=new StringBuffer("java");
    StringBuilder f2=new StringBuilder("java");
    StringBuilder f3=new StringBuilder("ja");
    StringBuilder f4=new StringBuilder("va");
    StringBuilder f5=f3.append(f4);
    
}




    
