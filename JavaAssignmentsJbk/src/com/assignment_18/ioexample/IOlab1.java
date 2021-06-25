package com.assignment_18.ioexample;

import java.io.FileInputStream;
import java.io.IOException;

public class IOlab1 {
	public static void main(String[] args){ 
	    try {
	         //windows file path - D:\notes\abc.txt //not allowed
	         //invalid escape sequence
	      String path = "D:\\notes\\abc.txt";
	         //or path = "D:/notes/abc.txt";
	    FileInputStream fis = new FileInputStream(path); 
	      int i=0;
	      while((i=fis.read())!=-1){ 
	         char c =(char) i; 
	         System.out.print(c);
	      }
	      fis.close();
	    }    
	    catch (IOException e) { 
	         e.printStackTrace();
	    }
	  }
	}

