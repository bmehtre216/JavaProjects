package string;

public class CountStringWords {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jump over the lazy dog";

		String[] words = sentence.split(" ");


		System.out.println("words in a string : "+words.length);
	}
}
