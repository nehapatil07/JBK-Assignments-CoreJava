package com.assignment_9_polymorphism;

public class Override_test {
public static void main(String[] args) {
	Bank bb=new Bank();
	Bank b1=new SBI();
	Bank b2=new ICICI();
	Bank b3=new Axis();
	System.out.println("Bank ROI>> "+bb.getRateofInterest()+" %");
	System.out.println("SBI Bank ROI>> "+b1.getRateofInterest()+" %");
	System.out.println("ICICI Bank ROI>> "+b2.getRateofInterest()+" %");
	System.out.println("Axis Bank ROI>> "+b3.getRateofInterest()+" %");
}
}
