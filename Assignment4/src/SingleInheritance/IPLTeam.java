package SingleInheritance;

public class IPLTeam {
	void play() {
		System.out.println("Two teams playing IPL");
	}
}

class CSK extends IPLTeam {
	void play() {
		System.out.println("CSK playing IPL");
	}
}

class RCB extends IPLTeam {
	void play() {
		System.out.println("RCB playing IPL");
	}

	public static void main(String args[]) {
		CSK c1 = new CSK();
		c1.play();

		RCB r1 = new RCB();
		r1.play();
	}
}