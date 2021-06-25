package com.assignment_15.collection;

import java.util.ArrayList;

public class Arraylist_demo2 {
public static void main(String[] args) {
	ArrayList<String> arl=new ArrayList<>();
	arl.add("PERL");
	arl.add("php");
	System.out.println(arl);
	System.out.println("element at index 1 is>>"+arl.get(1));
	System.out.println("Does it contain java?>>"+arl.contains("java"));
	System.out.println("is the list empty?"+arl.isEmpty());
	System.out.println("index of perl is>>"+arl.indexOf("PERL"));
	System.out.println("size of the arraylist is>>"+arl.size());
}
}
