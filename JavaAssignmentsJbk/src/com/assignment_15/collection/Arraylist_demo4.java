package com.assignment_15.collection;

import java.util.ArrayList;

public class Arraylist_demo4 {
public static void main(String[] args) {
	ArrayList<String> arl=new ArrayList<>();
	arl.add("zero");
	arl.add("first");
	arl.add("second");
	arl.add("third");
	arl.add("fourth");
	arl.add("random");
	System.out.println("list before clearing>>"+arl);
	arl.clear();
	System.out.println("List after clearing>>"+arl);
	
}
}
