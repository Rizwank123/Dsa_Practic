package stringsProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countVowel("Hello"));

	}
	private static int countVowel(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        int count =0;
        for(char c: str.toCharArray()) {
        	if(vowels.contains(c)) count++;
        }
        return count;
	}

}
