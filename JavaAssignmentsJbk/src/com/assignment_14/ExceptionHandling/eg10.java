package com.assignment_14.ExceptionHandling;

public class eg10 {
public static void main(String[] args) {
	int array[]={20,10,30};
	int num1=15, num2=0;
	int sum=0;
	try{
		sum=num1/num2;
		System.out.println("the result is:"+sum);
		for(int i=1;i<10;i++){
			System.out.println("Value of array is"+array[i]);
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("error1"+e);
	} catch(ArithmeticException e){
		System.out.println("error2"+e);
	}
	
}
}
