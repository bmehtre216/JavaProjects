package ArrayEXP;

import java.util.Scanner;

public class SumOf2Digitno {

	public static void main(String[] args) {
		
		/*int arr[]= {10,2,5,24,8,14,9};
		int sum=0;
		
		System.out.println("print sum of only 2 digit nos");
		for(int i=0;i<arr.length;i++)
			
		{
			if(arr[i]>9 && arr[i]<100)            //two digit no's with index position
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);*/
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		String s = sc.nextLine();
		System.out.println("s="+s);
		
		int sum = 0;
		for(int i=0;i<=s.length();i++)
		{
			char digit = s.charAt(i);
			if( Character.isDigit(digit))
			{
				sum += digit;
			}
			else
			{
				System.out.println("invalid input string not contain numeric value");
				return;
			}
			//System.out.print(digit+" ");
		}
		System.out.println("sum = "+sum);*/
		
//------------Taking Empty String---------------------------//---String[] array = str.toCharArray() ;
		String str = "Hello World";                         
		/*String rev = " ";                                  //     for(int i=array.length()-1; i>=0; i--)
                                                           //     		rev += a[i];                      ---> same														
		for(int i=str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		System.out.println("reversed :"+rev);*/
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
