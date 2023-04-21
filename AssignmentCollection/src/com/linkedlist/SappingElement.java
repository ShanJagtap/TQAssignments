package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class SappingElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		Collections.swap(list, 0, 2);

		System.out.println("after swapping:" + " " + list);

	}

}
