/**
 * 
 */
package module_3_array;

import java.lang.reflect.Array;

/**
 * 
 */
class JavaApplication {
	public static void execute1() {
    int[] array;
    array=new int[3];
    array[0]=1;
    array[1]=5;
    array[2]=79;
    for(int i=0;i<array.length;i++) {
    	System.out.print(array[i]+" ");
    }
    System.out.println();
    for(int i:array) {
    	System.out.print(i+" ");
    }  
    System.out.println();
}
  
	
	
	public static void execute2() {
//	   Class<Integer> datatype=int.class;
	   int[] array=(int[]) Array.newInstance(int.class, 3);
	   Array.setInt(array, 0, 1);
	   Array.setInt(array, 1, 2);
	   Array.setInt(array, 2, 3);
	   for(int i=0;i<array.length;i++) {
		   System.out.print(Array.getInt(array,i));  
		   System.out.print(" ");
	   }
	   
	    
	      
	}
}