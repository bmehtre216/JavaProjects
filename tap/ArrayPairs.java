package tap;
import java.util.Scanner;

public class ArrayPairs {
	public static boolean checkPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2; i*i<=n; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print("Enter array element:");
			ar[i] = sc.nextInt();
		}
		System.err.print("sum compare with : ");
		int sum = sc.nextInt();
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) 
			{
				if(checkPrime(ar[i]) || checkPrime(ar[j]))
				{
					System.out.println(ar[i]+"-"+ar[j]);
					
				}
			}
		} 
	}
}

//[2 3 4 5 7] 