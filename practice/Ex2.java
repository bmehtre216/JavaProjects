package practice;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[]=sc.next().toCharArray();
		
		 //char arr[] = {'N','O','2','6',' ','S','o','u'};
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr.length);
			 System.out.println("array elements AND ascii values");
			 System.out.println(arr[i]+" "+(int)arr[i]);
			
			 /*if(Character.isUpperCase(arr[i])) {
				 System.out.println(arr[i]);
			 }*/
			/* if(Character.isLowerCase(arr[i])) {
				 System.out.println(arr[i]);
			 }*/
			/* if(Character.isDigit(arr[i])) {
				 System.out.println(arr[i]);
			 }*/
			/* if(!Character.isSpace(arr[i]))
				 System.out.println(arr[i]);*/
		 }
	}
}
