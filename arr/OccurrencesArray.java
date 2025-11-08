package arr;

import java.util.Scanner;

public class OccurrencesArray {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to no of Occurrences \n");
			int[] numArr = ArrayUtility.inputArray();
			System.out.print("Now enter the number you want to find:");
			int num = scanner.nextInt();
			
			int occurrences = noOfOccurrences(numArr, num);
			System.out.println("your element was found "+ occurrences +" times in the Array");
	}
	public static int noOfOccurrences(int[] numArr, int num) {
		
		int count = 0;
		int i = 0;
		while(i < numArr.length) {
			if(numArr[i] == num)
				count ++;
			i++;
		}
		return count;
	}
}
