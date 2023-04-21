package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Gaurav");
		linkedList.add("Sahil");
		linkedList.add("Rushikesh");
		linkedList.add("Akash");
		linkedList.add("Mehul");

		System.out.println(linkedList);

		ArrayList<String> arrayList = new ArrayList<>(linkedList);
		System.out.println(arrayList);
	}

}
