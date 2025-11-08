package lectures;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		do {
			System.out.print("Enter your age: ");
			age=input.nextInt();
		}
		while(age < 0 || age > 100);
		System.out.println("your age is: "+age);
	}

}
