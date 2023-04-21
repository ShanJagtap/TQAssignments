package com.linkedlist;

import java.util.LinkedList;

public class ContainsElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		if (list.contains("Sahil")) {
			System.out.println("element is present");

		} else {
			System.out.println("element is not present");
		}

	}

}
