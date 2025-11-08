package datastructure;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        scanner.close();

        int vowelCount = 0;
        int consonantCount = 0;
        int wordCount = 0;

        // Convert the line to lowercase to simplify vowel/consonant checking
        String lowerCaseLine = line.toLowerCase();

        // Count vowels and consonants
        for (int i = 0; i < lowerCaseLine.length(); i++) {
            char ch = lowerCaseLine.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Check if it's an alphabet
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Count words
        // Split the line by one or more whitespace characters
        String[] words = line.trim().split("\\s+");
        if (words.length > 0 && !words[0].isEmpty()) { // Handle empty input or input with only spaces
            wordCount = words.length;
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of words: " + wordCount);
    }
}