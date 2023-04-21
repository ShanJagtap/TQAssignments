package com.linkedlist;

import java.util.LinkedList;

public class ReplaceElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		list.set(2, "Sagar");

		System.out.println(list);

	}

}
