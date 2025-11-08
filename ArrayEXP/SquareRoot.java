package ArrayEXP;

public class SquareRoot {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {5,12,4,21,8,2,3,7,9,11};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.2f\n",Math.sqrt(arr[i]));  //squareroot of each array element
			
			System.out.printf("%.2f\n",Math.pow(arr[i],3));  //cuberoot
		}

		/*System.out.println("sum of even nos in the array");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {                                //
				sum=sum+arr[i];}}
		System.out.println("Even sum :"+sum);*/
		
		/*System.out.println("sum of odd nos in the array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				sum=sum+arr[i];}}
		System.out.println("odd sum :"+sum);*/
		
		/*System.out.println("sum of two digit no");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 9 && arr[i] < 100) {
				sum=sum+arr[i];}}
		System.out.println(sum);*/
		
		System.out.println("sum of +ve nos");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 > 0) {
				sum=sum+arr[i];}}
		System.out.println(sum);
	}

}
