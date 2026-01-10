/**
 * 
 */
package com.capegemini.java_development.module_3_class_object;

/**
 * 
 */
public class JavaApplication {
     public static void execute() {
//    	 Student ss=new Student();
//    	 ss.setId(101);
//    	 ss.setName("Ramesh");
//    	 System.out.println(ss.getId());
//    	 System.out.println(ss.getName());
    	 Product p1=new Product(1,"Apsara","Pencil",19.99);
    	 System.out.println(p1);
    	 Product p2=new Product(1,"Apsara","Pencil",19.99);
    	 System.out.println(p2);
    	 System.out.println(p1.equals(p2));
    	 System.out.println( p1.hashCode());
    	 System.out.println( p2.hashCode());

    	
    	 
    	 


    	 
    	 
     }
}
