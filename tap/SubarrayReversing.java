package tap;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayReversing {
	public static String sortedReversingSubarray(int[] ar)
	{
		int[] temp = new int[ar.length];
		
		int i;
		for(i=0; i<ar.length; i++)
		{
			temp[i] = ar[i];
		}
		Arrays.sort(temp);
		
		int start = -1;
		int end = -1;
		
		for(i=0; i<ar.length; i++)
		{
			if(ar[i] != temp[i]) {
				start=i;
				break;
			}
		}
		
		for(i=ar.length-1; i>=0; i--)
		{
			if(ar[i] != temp[i]) {
				end=i;
				break;
			}
		}
		
		for(i=start; i<end; i++)
		{
			if(ar[i] < ar[i+1])
			{
				return "No";
			}
		}
		return "Yes";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println(sortedReversingSubarray(ar));
	}
}
//[1,2,5,4,3,6,7]