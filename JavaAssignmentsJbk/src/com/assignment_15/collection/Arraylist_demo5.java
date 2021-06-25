package com.assignment_15.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_demo5 {
public static void main(String[] args) {
	ArrayList<String> arrl = new ArrayList<>();
	arrl.add("First");
	arrl.add("Second");
	arrl.add("Third");
	arrl.add("Random");
	List<String> list = new ArrayList<>();
	list.add("Second");
	list.add("Random");
	System.out.println(" Does ArrayList contains all list elements?: " + arrl.containsAll(list));
	list.add("one");
	System.out.println("\n Does ArrayList contains all list elements?: " + arrl.containsAll(list));
	}
}
