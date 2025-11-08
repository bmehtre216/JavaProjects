package Interface;

public class TestShapes {

	public static void main(String[] args) {
		
		//Shape shape = new Shape() ;
		Circle circle = new Circle(2.0);
		Square square = new Square(2.0);
		
		System.out.printf("Area of Circle is %.2f\n ",circle.calculateArea());
		System.out.printf("Area of Square is %.2f",square.calculateArea());
	}	
}
	
