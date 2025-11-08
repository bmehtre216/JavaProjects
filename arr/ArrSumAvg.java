package arr;

import java.util.Scanner;

public class ArrSumAvg {
	
	public static void main(String[] args) {
		System.out.println("welcome to array sum and avg \n ");
		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		int avg = average(numArray);
		
		System.out.println("\nsum of the array nos is: "+sum);
		System.out.println("average of the array nos is: "+avg);
		System.out.println("your array is");
		printArr(numArray);
	}
	public static long sum(int[] numArray) {
		long sum = 0;
		int i = 0;
		while(i < numArray.length) {
			sum += numArray[i];
			i++;
		}
		return sum;
	}
	public static int average(int[] numArray) {
		long sum = sum(numArray);
		return (int)(sum/numArray.length);
	}
	public static void printArr(int[] numArray) {
		//int[] numArray = ArrayUtility.inputArray() ;
		int i = 0;
		while(i < numArray.length) {
			System.out.print(numArray[i]+" ");
			i++;
		}
	}
}
