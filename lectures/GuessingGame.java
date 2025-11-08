package lectures;

import java.util.Scanner;

public class GuessingGame {
	int random;
	
	GuessingGame() {
		random = (int) Math.ceil(Math.random()*100);
	}

	/*-ve if guess no is small
	  0 if guess no currect
	  +ve if guess no big*/
	int guess(int guessNumber) {
		return guessNumber - random;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to guessing game world 1-to-100\n ");
		
		GuessingGame game = new GuessingGame();
		int guess, result;
		
		do {
			System.out.print("please guess the number : ");
			guess = scanner.nextInt();
			result = game.guess(guess);
			if(result == 0)
			{
				System.out.println("Congrats, your guess is correct");
			}
			else if(result < 0 )
			{
				System.out.println("Please guess higher");
			}else
			{
				System.out.println("Please guess lower");
			}
		}while(result != 0);
	}

}
