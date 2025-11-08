package arr;

import java.util.Arrays;

public class SecSmall {

	public static void main(String[] args) {
		int[] ar = {5,9,6,4,7,9};
		System.out.println(secondSmallest(ar));
	}
	
	public static int secondSmallest(int[] ar) {
		
		int min1=0, min2=0;
		if(ar[0] < ar[1]) {
			min1 = ar[0];
			min2 = ar[1];
		}
		else {
			min1 = ar[1];
			min2 = ar[0];
		}
		
		for(int i = 2; i < ar.length; i++) {
			if(ar[i] < min1) {
				min2 = min1;
				min1 = ar[i];
			}
			else if(ar[i] < min2) {
				min2 = ar[i];
			}
		}
		return min2;
	}

}
