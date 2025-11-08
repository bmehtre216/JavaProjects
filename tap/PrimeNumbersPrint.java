package tap;

import java.util.Scanner;

public class PrimeNumbersPrint {
	static boolean isPrime(int n)
	{
		if(n==1)
			return false;

		if(n==2 || n==3)
			return true;

		for(int i=5; i*i<n; i=i+6)
		{
			if(n%i==0 || n%i+2==0)
				return false;
		}
		return true;
	}
	static boolean checkPrime(int n)
	{
		if(isPrime(n))
		{
			return true;
		}
		return false;
	}
	static void printPrime(int n)
	{
		for(int i=2; i<=n; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(checkPrime(n));
	}

}
