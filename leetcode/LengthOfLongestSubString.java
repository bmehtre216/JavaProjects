package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {

	public static void main(String[] args) {
		
		String s = "abcdabcbb";
		
		int start = 0;
		int end = 0;
		int max_length = 0;
		
		List<Character> list = new ArrayList<>();
		
		while(end < s.length())
		{
			if(list.contains(s.charAt(end)))
			{

				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
			else
			{
				list.add(s.charAt(end));
				end++;
				max_length = Math.max(max_length, list.size());
			
			}
		}
		System.out.println("Maximum length is "+max_length);
	}

}
