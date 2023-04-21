package overriding;

public class Programmer {
	void workingHours() {
		System.out.println("8 Working hours");
	}
}

class Employee extends Programmer {
	void workingHours() {
		System.out.println("12 working hours");
	}

	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.workingHours();
	}
}