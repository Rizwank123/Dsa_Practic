package stringsProblems;

import java.util.Scanner;

public class CountDuplicateCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------enter the string--------");
		String s = sc.next();
		// TODO Auto-generated method stub
		System.out.println(countDuplicate(s));

	}
	
	private static String countDuplicate(String s) {
		int[] charCount = new int[26];
		for(char c: s.toCharArray()) {
			charCount[c-'a']++;
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<charCount.length;i++) {
			if(charCount[i]>1) {
				char c =(char) ('a'+i);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
