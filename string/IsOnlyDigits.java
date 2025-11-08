package string;

import java.security.PublicKey;

public class IsOnlyDigits {

	public static void main(String[] args) {
		
		String str1 = "12345";
		String str2 = "123asdf";
		
		System.out.println(str1+"   -> "+isOnlyDigits(str1));
		System.out.println(str2+"   -> "+isOnlyDigits(str2));
	}
	
	public static boolean isOnlyDigits(String s) {
		
		for(int i=0; i<s.length(); i++) {
			
			if(!Character.isDigit(s.charAt(i))){
				return false;
			}
		}
		return true;
	}
}
