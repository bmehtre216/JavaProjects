package practice;
import java.util.*;

public class Ex1 {

	/*
	 * public static void main(String[] args) { int arr[] = {5,8,6,4,7,2}; int min =
	 * arr[0]; int max = arr[0]; for (int i = 0; i < arr.length; i++) { if(arr[i] <
	 * min) { min = arr[i]; }
	 * 
	 * if(arr[i] > max) { max = arr[i]; }
	 * 
	 * }System.out.println("minimum :"+min+"    maximum: "+max);
	 * 
	 * }
	 */
	// Java Program to print pattern
	// Number triangle pattern


	    
	    // Function to demonstrate pattern
	    public static void printPattern(int n)
	    {
	        int i, j;
	        
	        // outer loop to handle number of rows
	        for (i = 1; i <= n; i++) {
	            
	            // inner loop to print space
	            for (j = 1; j <= n - i; j++) {
	                System.out.print("*");
	            }
	            
	            // inner loop to print star
	            for (j = 1; j <= i; j++) {
	                System.out.print(i + "*");
	            }
	            
	            // print new line for each row
	            System.out.println();
	        }
	    }

	    // Driver Function
	    public static void main(String args[])
	    {
	        int n = 6;
	        printPattern(n);
	    }
	
}
