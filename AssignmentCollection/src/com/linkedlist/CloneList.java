package com.linkedlist;

import java.util.LinkedList;

public class CloneList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		LinkedList<String> newList = new LinkedList<>();
		newList = (LinkedList<String>) list.clone();

		System.out.println(newList);
	}
}
