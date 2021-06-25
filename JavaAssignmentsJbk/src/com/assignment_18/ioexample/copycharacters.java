package com.assignment_18.ioexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copycharacters {
public static void main(String[] args) throws IOException {
	FileReader reader = null;
    FileWriter writer = null;
try {
 reader = new FileReader("jbk.txt"); 
 writer = new FileWriter("coralsoft.txt");
 int c;
 while ((c=reader.read()) !=-1){ 
    writer.write(c);
}
}finally{
 if (reader !=null){ reader.close();
 }
 if (writer !=null){ writer.close();
 }
	}
}
}
