package leetcode;

import java.util.Arrays;

public class Anagrams { //Anagrams are strings having same characters with same frequency

	public static void main(String[] args) {
		
		String s1 = "peek";
		String s2 = "keep";
		
		if(isAnagrams(s1, s2))
		{
			System.err.println(s1+" and "+s2+" are Anagrams");
		}
	}
	static boolean isAnagrams(String s1, String s2)
	{
		if(s1.length() != s2.length()) {
			return false;
		}
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			return true;
		}else {
			return false;
		}
	}
}
