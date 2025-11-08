package lectures;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5, guess;
		
		System.out.println("Welcome to the number guess\n");
		do {
			System.out.print("Please guess the number b/w 0 to 9 :");
			guess = input.nextInt();
		} while (num != guess);
		
		System.out.println("you have successfully guessed the number");
		
	}

}
