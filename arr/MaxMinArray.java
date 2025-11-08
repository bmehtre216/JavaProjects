package arr;

public class MaxMinArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Max and Min Array element find \n");
		int[] numArr = ArrayUtility.inputArray();
		
		int min = min(numArr);
		int max = max(numArr);
		System.out.print("min array element is:"+min+"\n" );
		System.out.print("max array element is:"+max);

	}
	public static int min(int[] numArr) {
		int min = numArr[0];
		int i = 1;
		while(i < numArr.length) {
			if(min > numArr[i]) {
				min = numArr[i];
			}
			i++;
		}
		return min;
	}

	public static int max(int[] numArr) {
		int max = numArr[0];
		int i = 1;
		while(i < numArr.length) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
			i++;
		}
		return max;
	}
}
