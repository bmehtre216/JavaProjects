package tap;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean isPrime(int n)
	{
		for(int i=0; i<Math.sqrt(i); i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(isPrime(n));
	}
}
/*more efficient way -----> put this in isPrime(){----}
	if(n==1)
		return false;

	if(n==2 || n==3)
		return true;

	for(int i=5; i*i<n; i=i+6)
	{
		if(n%i==0 || n%i+2)
			return false;
	}
	return true;
*/