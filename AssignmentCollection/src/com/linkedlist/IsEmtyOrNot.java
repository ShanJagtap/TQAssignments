package com.linkedlist;

import java.util.LinkedList;

public class IsEmtyOrNot {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);
		System.out.println(list.isEmpty());

		LinkedList<String> list4 = new LinkedList<>();
		System.out.println(list4.isEmpty());
	}

}
