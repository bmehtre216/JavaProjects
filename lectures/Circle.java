package lectures;

import java.util.Scanner;

public class Circle {
	double radiusInmm;
	
	public Circle(double radiusInmm) {
		this.radiusInmm = radiusInmm;
	}
	double getCircumference() {
		return 2 * Math.PI * radiusInmm;
	}
	double getArea() {
		return Math.PI * Math.pow(radiusInmm, 2);
	}
	@Override
	public String toString() {
		return "Circle : Radius in mm :" + radiusInmm
				+ ", Circumference in mm : " + getCircumference() 
				+ ", Area in mm:" + getArea();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Welcome to the world of circle\n ");
		System.out.print("Please Enter your radius: ");
		
		double radius = input.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println(circle);
	}
}
