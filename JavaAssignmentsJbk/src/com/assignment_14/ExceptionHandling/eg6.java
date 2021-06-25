package com.assignment_14.ExceptionHandling;
import java.io.*;
import java.io.IOException;

public class eg6 {
void mymethod(int num) throws IOException, ClassNotFoundException
	{
		if(num==1){
			throw new IOException("Exception message1");
		} else{
			throw new ClassNotFoundException("Exception msg2");
		}
	}
}
