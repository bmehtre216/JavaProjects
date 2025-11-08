package nestedClass;

public class Car { // nested and inner classes
	
	private static int noOfDoors;
	private int cost;
	
	public void repair() {
		Tire tire = new Tire();
	}
	
	public static class Tire {
		private double width;
		private double pressure;
		private String material;
		
		public void inflate() {
			noOfDoors = 5;        //static nested class only access static 
			                      //members of outer class
			//cost = 9000;
		}
	}
}
