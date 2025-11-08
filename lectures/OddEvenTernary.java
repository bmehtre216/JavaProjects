package lectures;

import java.util.Scanner;

public class OddEvenTernary {

	public static void main(String[] args) {
		System.out.println("Welcome to Odd Even Ternary check \n ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your num: ");
		int num = input.nextInt();
		
		String result = num % 2 == 0 ? "Even" : "Odd";
		
		System.out.println("Your number is: "+result);
	}

}
