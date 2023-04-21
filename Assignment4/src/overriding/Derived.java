package overriding;

public class Derived {
	public void getDetails(String temp) {
		System.out.println("Derived class " + temp);
	}
}

class Test extends Derived {
	public int getDetails(int temp) {
		System.out.println("Test class " + temp);
		return temp;
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.getDetails("Hello");
	}
}