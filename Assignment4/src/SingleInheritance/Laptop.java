package SingleInheritance;

public class Laptop {
	private int noOfUSBPort;
	private int processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	@Override
	public String toString() {
		return "Laptop [noOfUSBPort=" + noOfUSBPort + ", processorSpeed=" + processorSpeed + "]";
	}
}
