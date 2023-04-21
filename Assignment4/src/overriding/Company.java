package overriding;

public class Company {
	void Address() {
		System.out.println("Pune");
	}
}

class Ebay extends Company {
	void Address() {
		System.out.println("Mumbai");
	}

	public static void main(String args[]) {
		Company c1 = new Company();
		c1.Address();

		Ebay e1 = new Ebay();
		e1.Address();
	}
}
