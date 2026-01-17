/**
 * 
 */
package com.capegemini.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileHandler {
    public static final String path="C:\\Users\\HP\\OneDrive\\Desktop\\Java_Core\\File Handling\\data.txt";
    public static final String data="Hello World";
    public static File file=new File(path);
    public static void create() throws IOException{
    	if(file.createNewFile()) {
    		System.out.println("File created");
    	}
    	else {
    		System.out.println("File already exists");
    	}
    }
    public static void update() throws IOException {
    	FileWriter filewriter=new FileWriter(file);
    	filewriter.write(data);
    	filewriter.flush();
    	filewriter.close();
    	System.out.println("File updated ");
    }
    
    public static void read() throws FileNotFoundException,IOException{
    	  FileReader fileReader = new FileReader(file);

          int i;
          while ((i = fileReader.read())>0) {
              System.out.print((char) i);
          }
          System.out.println();
          fileReader.close();
    	
    }
    public static void delete() {
    	if(file.delete()) {
    		System.out.println("File deleted successfully");
    	}
    	else {
    		System.out.println("File does not exits");
    	}
    	
    }
    
}
