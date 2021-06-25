package com.assignment_18.ioexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class eg5_update {
public static void main(String[] args) {
	BufferedReader br=null;
	String oldcontent="";
	File fs=new File("D://success.txt");
	try{
		String content;
		FileReader fr=new FileReader(fs);
		br=new BufferedReader(fr);
		while ((content = br.readLine()) != null) {
			oldcontent = oldcontent.concat(content).concat("\n");
	}
} catch(IOException ee){
	ee.printStackTrace();
	}
	finally{
		try{
			if(br!=null){
				br.close();
			}  
			}catch(IOException ex){
				ex.printStackTrace();
		}
	}
}
}
