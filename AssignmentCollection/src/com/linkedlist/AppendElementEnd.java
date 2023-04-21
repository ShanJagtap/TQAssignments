package com.linkedlist;

import java.util.LinkedList;

public class AppendElementEnd {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("java");
		list.add("Python");
		System.out.println(list);

		System.out.println("====================");
		list.add("Angular");
		System.out.println(list);
		list.addLast("NodeJS");
		System.out.println(list);
		list.offer("ReactJS");
		System.out.println(list);
		list.offerLast("JEE");
		System.out.println(list);
	}
}
