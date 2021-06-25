package com.assignment_15.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_demo1 {
public static void main(String[] args) {
	ArrayList<String> arrl=new ArrayList<>();
	arrl.add("pune");
	arrl.add("mumbai");
	arrl.add("Nagpur");
	arrl.add("aurangabad");
	
	Iterator<String> itr=arrl.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
