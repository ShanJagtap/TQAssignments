package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
