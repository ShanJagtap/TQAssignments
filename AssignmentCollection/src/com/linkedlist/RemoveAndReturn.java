package com.linkedlist;

import java.util.LinkedList;

public class RemoveAndReturn {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		System.out.println(list.pop());

		System.out.println(list);

	}

}
