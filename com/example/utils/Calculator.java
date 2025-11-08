package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {

	public static void main(String[] args) {
		Circle cir = new Circle(5.5);
		Rectangle rec = new Rectangle(10, 5);
		
		double cirArea = Math.PI * Math.pow(cir.radius, 2);
		double recArea = rec.length * rec.breadth;
		
		System.out.printf("Area of circle is: %f, Area of the rectangle is %f",
				cirArea,recArea);
	}
}
