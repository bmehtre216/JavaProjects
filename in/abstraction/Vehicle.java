package in.abstraction;

public class Vehicle {

	private int noOfTires;

	public Vehicle(int noOfTires) {
		this.noOfTires = noOfTires;
	}
	//public Vehicle() {}


	public int getNoOfTires() {
		return noOfTires;
	}

	public void setNoOfTires(int noOfTires) {
		this.noOfTires = noOfTires;
	}
	
	public void commute() {
		System.out.println("going...  ");
	}
	
	
}
