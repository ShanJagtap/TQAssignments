package com.linkedlist;

import java.util.LinkedList;

public class RemoveFirstAndLast {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		list.removeFirst();

		System.out.println(list);

		list.removeLast();

	}

}
