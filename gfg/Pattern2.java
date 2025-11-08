package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern2 {
	private static final float String = 0;
	/*
	 * public static String compareNM(int n, int m) { // code here String str = (n <
	 * m) ? "lesser":(n == m ) ? "equsl":"greater"; return str; } public static void
	 * main(String[] args) { int n=10, m=5; System.out.println(compareNM(n, m)); }
	 */
	
	  static ArrayList<Float> divisionWithPrecision(float a, float b) {
	        // code here
		  ArrayList<Float> arrayList = new ArrayList<>();
	        float c = a/b;
	        float d = a/b;
	
	        float e = (float) (Math.round(d * 1000.0) /1000.0);
	      
	        arrayList.add(0, c);
	        arrayList.add(1, e);
	        
	        return arrayList;

	  }
	  public static void main(String args[]) {
		//float a =  5.43f, b = 2.653f;
		//System.out.println(divisionWithPrecision(a, b));
		 
		  Scanner s = new Scanner(System.in);
		  String name = s.nextLine();
		  int a = s.nextInt();
		  float b = s.nextInt();
		  long c = s.nextLong();
		  byte d = s.nextByte();
		  

		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
		  System.out.println(d);
		  System.out.println(name);
		  }
	  
}
