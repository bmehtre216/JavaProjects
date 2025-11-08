package arr;

import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		Scanner scanner = new Scanner(System.in);
										System.out.print("please enter the number of elements: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		
		int i=0;
		while(i < nums.length) {
										System.out.print("please enter element no "+(i+1)+" :");
			nums[i] = scanner.nextInt();
			i++;
		}
		return nums;
	}
	public static int[][] input2DArray() {
		Scanner scanner = new Scanner(System.in);
										System.out.print("please enter the number of rows: ");
		int rows = scanner.nextInt();
										System.out.print("please enter the number of columns: ");
		int columns = scanner.nextInt();
		
		int[][] numArray = new int[rows][columns];
		
		int i=0;
		while(i < rows) {
			int j=0;
			while(j < columns) {
							  System.out.print("please enter element rows "+(i+1)+", columns "+(j+1)+" :");
				numArray[i][j] = scanner.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}
	public static void displayArray(int[] numArray) {
		int i = 0;
		while(i < numArray.length) {
								System.out.print(numArray[i]+" ");
			i++;
		}
		System.out.println();
	}
}
