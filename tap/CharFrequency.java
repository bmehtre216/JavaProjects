package tap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class CharFrequency
{
	public static void main(String args[])
	{
		String str = "Programming";
		
		HashMap<Character, Integer> freqMap = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(freqMap.containsKey(ch)) {
				
				freqMap.put(ch, freqMap.get(ch)+1);
			}else {
				freqMap.put(ch, 1);
			}
		}
		
		System.out.println("Character Frequencies:");
        for (char key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
	}
}