/**
 * 
 */
package com.capegemini.file_handling;

import java.io.IOException;

/**
 * 
 */
public class JavaApplication {
     public static void execution() {
    	 try {
//    		 FileHandler.create();
    		 FileHandler.update();
    		 FileHandler.read();
//    		 FileHandler.delete();
    	 }
    	 
    	 catch (IOException e) {
    		 e.printStackTrace();
    	 }
     }
}
