package com.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReversedLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		ListIterator<String> itr = list.listIterator(list.size());

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
