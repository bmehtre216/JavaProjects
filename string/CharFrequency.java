package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {
	public static void main(String[] args) {
		String str = "hello java";
		
		Map<Character, Integer> freqMap = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// ignore spaces (optional)
			if (ch == ' ')
				continue;

			if (freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch) + 1);
			} else {
				freqMap.put(ch, 1);
			}
		}
		System.out.println(freqMap);
		// Print frequency
		for (char key : freqMap.keySet()) {
			System.out.println(key + " -> " + freqMap.get(key));
		}
	}
}
