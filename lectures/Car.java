package lectures;

public class Car {
	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelInLiters;
	int noOfSeats;
	
	Car(String color){
		noOfWheels = 4;
		this.color = color;
		maxSpeed = 150;
		currentFuelInLiters = 2;
		noOfSeats = 5;
		System.out.println(color);
	}
	Car(){
		color="black";
		currentFuelInLiters = 5;
		System.out.println(currentFuelInLiters);
	}
	public void start() {
		if(currentFuelInLiters == 0) {
			System.out.println("Car is out of fuel");
		}
		else if (currentFuelInLiters < 5) {
			System.out.println("Car is in reserve mode, please refuel");
		}else {
			System.out.println("Car is started.....bruhhhhm");
		}
	}
	
	public void drive() {
		currentFuelInLiters--;
		System.out.println("Car is Driving");		
	}
	
	public void addFuel(float fuel) {
		currentFuelInLiters += fuel;
	}
	public float getCurrentFuelLevel() {
		return currentFuelInLiters;
	}
	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", currentFuelInLiters=" + currentFuelInLiters + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
}
