package string;

import java.util.Scanner;

public class StringsPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "Wel Come To Pw";
		String result = "";
		//lowercase
		/*
		 * for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i);
		 * 
		 * if(ch >= 'A' && ch <= 'Z') { ch = (char) (ch + 32); } result += ch; }
		 */
		//uppercase
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				ch = (char) (ch-32);
			}
			result += ch; 
		}
		System.out.println("original : "+str);
		System.out.println("new result : "+result);
	}

}
