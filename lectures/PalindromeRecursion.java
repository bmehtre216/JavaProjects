package lectures;

import java.util.Scanner;

public class PalindromeRecursion {

	public static void main(String[] args) {
		System.out.println("Welcome to palindrome Recursion \n");
		System.out.print("Enter your string: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		System.out.println("Your string is "+ (isPalindrome(str) ? "Palindrome" : "not a Palindrome"));
	}
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		int lastPos = str.length() - 1;
		if (str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newString = str.substring(1, lastPos);
		return isPalindrome(newString);
	}

}
