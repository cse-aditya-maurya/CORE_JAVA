/**
 * 
 */
package module_3_array;

import java.lang.reflect.Array;

/**
 * 
 */
public class ArrayDeclaration {
      public static void execution1() {
    	  int[] array=new int[5];
    	  for(int i=0;i<array.length;i++) {
    		  array[i]=i+1;
    		  
    	  }
    	  for(int i=0;i<array.length;i++) {
    		  System.out.print(array[i]+" ");
    	  }
    	  System.out.println();
    }
      public static void execution2() {
    	  Integer[] array=(Integer[]) Array.newInstance(Integer.class,5);
    	  for(int i=0;i<array.length;i++) {
    		 Array.set(array,i,i+1);
    		  
    	  }
    	  for(int i=0;i<array.length;i++) {
    		  
    		System.out.print(Array.get(array,i)+" ");

    	  }
    	  
      }
}
