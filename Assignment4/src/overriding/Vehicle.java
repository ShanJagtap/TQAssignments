package overriding;

public class Vehicle {

	void accelerate(long mph) {
		mph = 50;
	}

	public String stop(String stop) {
		stop = "STOP";
		return stop;
	}

	public String run(String run) {
		run = "RUN";
		return run;
	}
}

class Car extends Vehicle {
	void accelerate(long mph) {
		mph = 60;
	}

	public static void main(String args[]) {
		Car c1 = new Car();
		c1.accelerate(60);
	}
}