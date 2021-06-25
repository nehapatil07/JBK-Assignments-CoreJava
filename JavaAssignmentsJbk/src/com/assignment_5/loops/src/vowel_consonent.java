package com.assignment_5.loops.src;

import java.util.Scanner;

public class vowel_consonent {
public static void main(String[] args) {
	boolean isvowel=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the char");
	char ch=sc.next().charAt(0);
	sc.close();
	switch (ch){
	case 'a':
	case 'e':
	case 'i':
	case '0':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':isvowel=true;
	}
	if (isvowel==true){
		System.out.println("character is vowel");}
	else{
		if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
			System.out.println("character is consonent");
		}else {
			System.out.println("not an alphabet");
		}
	}}		
		

	
}
