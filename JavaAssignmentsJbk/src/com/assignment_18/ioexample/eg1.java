package com.assignment_18.ioexample;

import java.io.File;

public class eg1 {
public static void main(String[] args) {
	try{
		String one="E:/nsp";
		String many="E:/nsp/hi/hello";
		File fs=new File(one);
		if (!fs.exists()){
			if (fs.mkdir()){
				System.out.println("file"+one+"created");
			}
		}
		File fs1=new File(many);
		if(!fs1.exists()){
			if(fs1.mkdirs()){
				System.out.println("File"+many+"created");
			}
		}
		
	} catch(Exception e){
		System.out.println("Error"+e.getMessage());
	}
	}
	}
	

