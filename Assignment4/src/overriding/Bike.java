package overriding;

public class Bike {
	String colour;
	float speed;

	void bikeInfo(String colour, float speed) {
		colour = "Black";
		speed = 200f;
		System.out.println("colour" + " " + colour + " " + "speed" + " " + speed);
	}
}

class Pulsor extends Bike {
	void bikeInfo(String colour, float speed) {
		colour = "NaviBlue";
		speed = 240f;
	}

	public static void main(String args[]) {
		Pulsor p1 = new Pulsor();
		p1.bikeInfo("White", 250);

	}
}
