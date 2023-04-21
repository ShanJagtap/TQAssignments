package com.linkedlist;

import java.util.LinkedList;

public class RetriveNoRemove {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		System.out.println("Retrive last element:" + " " + list.getLast());

		System.out.println("Retrive last element:" + " " + list.getFirst());

	}

}
