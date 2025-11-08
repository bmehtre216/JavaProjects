package string;

public class LogestWord {

	public static void main(String[] args) {

		String sentence = "The quick brown fox jump over the lazy dog";

		String[] words = sentence.split(" ");

		String longest = "";
		
		for (String word : words) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println(longest);
	}
}
