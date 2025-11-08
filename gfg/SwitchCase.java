package gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchCase {
	/*static double switchCase(int choice, List<Double> arr) {

		switch (choice) {
		case 1: {
			double R = arr.get(0);
			double area = Math.PI * R * R;
			return area;
		}

		case 2:
			double L = arr.get(0), B = arr.get(1);
			double area = L * B;
			return area;

		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter choice : ");
		int choice = s.nextInt();
		
		List<Double> list = new ArrayList<>();
		
		if(choice == 1)
		{
			list.add(5.0);
			System.out.println(switchCase(choice, list));
		}
		if(choice == 2) 
		{
			list.add(5.0);
			list.add(10.0);
			System.out.println(switchCase(choice, list));
			
		}
	}*/
	
	//Write a program to input a number (1–7) and print the corresponding day of the week using
	static void switchDay(int day) {

		switch (day) {
			case 1: {
				System.out.println("Monday");
				break;
			}
			case 2:
			{
				System.out.println("Twesday");
				break;
			}
			case 3:
			case 4:
			case 5:
				System.out.println("midweek");
				break;
			
			case 6:
			case 7:
				System.out.println("weekend..");
				break;
			
			default:
				System.out.println("Invalid day..........entered");
		}
	}
	public static void main(String args[]) {
		Scanner sd = new Scanner(System.in);
		System.out.print("Enter day no:");
		int day = sd.nextInt();
		
		switchDay(day);
	}
}
