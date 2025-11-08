package lectures;

import arr.ArrayUtility;

public class MaxArrayElement {

	public static void main(String[] args) {
		System.out.println("Welcome to finding the max element \n");
		int[] arr = ArrayUtility.inputArray();
		
		
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("max array element is: "+max);
	}

}
