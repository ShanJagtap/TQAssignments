package com.linkedlist;

import java.util.LinkedList;

public class IterateLinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		int startIndex = 2;

		for (int i = startIndex; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
