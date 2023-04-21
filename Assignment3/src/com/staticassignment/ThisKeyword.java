package com.staticassignment;

public class ThisKeyword {
	private int id;
	private String name;
	private String address;

	public ThisKeyword() {

	}

	public ThisKeyword(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ThisKeyword(int id, String name, String address) {
		this(id, name);
		this.address = address;
	}

	public String toString() {
		return id + " " + name + " " + address;
	}
}
