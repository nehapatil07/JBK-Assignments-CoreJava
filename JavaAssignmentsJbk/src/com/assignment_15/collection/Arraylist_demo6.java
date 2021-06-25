package com.assignment_15.collection;

import java.util.ArrayList;

public class Arraylist_demo6 {
	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Delhi");
		arrl.add("Nagpur");
		System.out.println(" Actual ArrayList:" + arrl);
		String []strArr=new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("created array content");
		for(String str:strArr){
			System.out.println(str);
		}
	}
	
}
