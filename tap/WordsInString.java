package tap;

import java.util.Scanner;

public class WordsInString {
	public static int countWords(String s)
	{
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') 
			{
				count++;
			}
		}
		return s.charAt(0)==' ' ? count : count+1 ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		int words = countWords(s);
		System.out.println(words);
		
	}

}
