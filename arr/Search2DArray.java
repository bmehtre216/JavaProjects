package arr;

import java.util.Scanner;

public class Search2DArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to 2D Search \n");
		int[][] numArr = ArrayUtility.input2DArray();
		
		System.out.print("Enter number you want to search:");
		int num = scanner.nextInt();
		
		boolean isFound = search(numArr, num);
		if(isFound) {
			System.out.println("~Your number was found");
		}else {
			System.out.println("~Your number was not found");
		}
	}
	public static boolean search(int[][] numArr, int num) {
		int i = 0;
		while(i < numArr.length) {
			int j = 0;
			while(j < numArr[i].length) {
				if(numArr[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
}