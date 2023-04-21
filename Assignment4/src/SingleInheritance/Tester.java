package SingleInheritance;

class Electronics {
	void Electronics() {
		System.out.println("TV");
	}

	void ElectronicType() {
		System.out.println("Samsung");
	}
}

class Grinder extends Electronics {
	void Grinder() {
		System.out.println("Grinder:");
	}
}

class WetGrinder extends Grinder {
	void WetGrinder() {
		System.out.println("wetgrinder");
	}

	public static void main(String args[]) {
		WetGrinder wt = new WetGrinder();
		wt.Electronics();
		wt.Grinder();
	}
}