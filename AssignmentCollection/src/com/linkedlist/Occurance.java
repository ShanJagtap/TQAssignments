package com.linkedlist;

import java.util.LinkedList;

public class Occurance {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		String l1 = list.getFirst();

		System.out.println(l1);

		String l2 = list.getLast();

		System.out.println(l2);
	}
}
