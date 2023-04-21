package com.linkedlist;

import java.util.LinkedList;

public class JoinTwoList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Gaurav");
		list1.add("Sahil");
		list1.add("Rushikesh");
		list1.add("Akash");
		list1.add("Mehul");

		list.addAll(list1);

		System.out.println(list);

	}

}
