package overriding;

public class Kid {

	void readBook() {
		System.out.println("Kid");
	}

	void readBook(String name, int age) {
		System.out.println();
	}
}

class BigKid extends Kid {

	void readBook() {
		System.out.println("BigKid");
	}

	public static void main(String args[]) {
		Kid k1 = new Kid();
		k1.readBook();

		BigKid b1 = new BigKid();
		b1.readBook();
	}
}
