package arr;

public class SumAverage2dArray {

	public static void main(String[] args) {
		System.out.println("Welcome to sum And Average of 2D \n");
		int[][] numArr = ArrayUtility.input2DArray();
		long sum = sum(numArr);
		double avg = average(numArr);
		System.out.println("sum : "+sum);
		System.out.println("average : "+avg);
	}
	public static long sum(int[][] arr) {
		long sum = 0;
		int i = 0;
		while(i < arr.length) {
			int j=0;
			while(j < arr[0].length) {
				sum += arr[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	public static double average(int[][] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int rows = arr.length;
		int columns = arr[0].length;
		long size = rows * columns;
		
		
		return sum(arr)/size;
	}

}
