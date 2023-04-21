package overriding;

public class Person {
	void readScript() {
		System.out.println("person readed Script");
	}
}

class Actor extends Person {
	void readScript() {
		System.out.println("Actor readed Script");
	}

	public static void main(String args[]) {
		Actor a1 = new Actor();
		a1.readScript();
	}
}