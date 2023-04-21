package com.linkedlist;

import java.util.LinkedList;

public class InsertAtAnyPosition {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		list.add(2, "Gaurav");

		System.out.println("after adding elements:" + " " + list);
	}

}
