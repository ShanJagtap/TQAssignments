package SingleInheritance;

import java.util.Scanner;

public class LaptopTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop l1 = new Laptop();

		System.out.println("Enter number of USBPort:");
		l1.setNoOfUSBPort(sc.nextInt());

		System.out.println("Enter Processor Speed:");
		l1.setProcessorSpeed(sc.nextInt());

		System.out.println("------------------------------");

		System.out.println("Total USBPort:" + l1.getNoOfUSBPort());
		System.out.println("Processor Speed:" + l1.getProcessorSpeed());
		sc.close();
	}

}
