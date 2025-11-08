package string;

import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "swiss";

		LinkedHashMap<Character, Integer> lhMap = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ')
				continue;

			lhMap.put(ch, lhMap.getOrDefault(ch, 0) + 1);
		}
		//System.out.println(lhMap);
		for (char ch : lhMap.keySet()) {
			if (lhMap.get(ch) == 1) {
				System.out.println("First non-repeated character: " + ch);
				return;
			}
		}
		System.out.println("all are repeated");
	}

}
