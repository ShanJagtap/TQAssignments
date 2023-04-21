package com.staticassignment;

class Animal {
	String color = "white";

	public Animal() {
		System.out.println("Animal is created");
	}

	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	String color = "Black";

	public Dog() {
		super();
		System.out.println("dog is created");
	}

	void eat() {
		System.out.println("eating bread");
	}

	void bark() {
		System.out.println("barking");
	}

	void work() {
		super.eat();
		bark();
	}

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperUse {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.printColor();
		d.work();
	}
}
