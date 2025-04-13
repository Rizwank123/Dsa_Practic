package stringsProblems;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
	}
	
	private static boolean isAnagram(String str1, String str2) {
		// Normalize the strings

        str1 = str1.replaceAll("\\s+", "").toLowerCase();

        str2 = str2.replaceAll("\\s+", "").toLowerCase();


        // Check if lengths are the same

        if (str1.length() != str2.length()) {

            return false;

        }


        // Create a frequency array for 26 letters (assuming only lowercase letters)

        int[] charCount = new int[26];


        // Count characters in str1

        for (char c : str1.toCharArray()) {

            charCount[c - 'a']++;

        }


        // Decrease count for characters in str2

        for (char c : str2.toCharArray()) {

            charCount[c - 'a']--;

        }


        // Check if all counts are zero

        for (int count : charCount) {

            if (count != 0) {

                return false;

            }

        }


        return true;
	}

}
