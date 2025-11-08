package tap;

import java.util.Scanner;

public class Test1 {
	
	static int beautifulBracket(String s) {
		char c = ' ';
		int bracket=0, count=0;
		for (int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			if(c == '(') {
				bracket++;
			}else {
				if(bracket<=0) {
					count++;
				}else {
					bracket--;
				}
			}
		}
		return bracket;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(beautifulBracket(s));
	}

}
