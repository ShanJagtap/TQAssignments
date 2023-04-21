package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println("before shuffle:" + list);
		Collections.shuffle(list);

		System.out.println("after shuffle:" + list);
	}
}
