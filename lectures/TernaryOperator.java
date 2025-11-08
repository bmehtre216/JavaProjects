package lectures;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		System.out.println("Welcome to ternaryoperator \n ");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter num1: ");
		int num1 = input.nextInt();
		System.out.print("Please enter num2: ");
		int num2 = input.nextInt();
		
		int bigNumber = num1 > num2 ? num1 : num2;
		
		System.out.println("Big num is: "+bigNumber);
	}
 
}
