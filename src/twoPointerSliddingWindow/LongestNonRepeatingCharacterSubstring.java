package twoPointerSliddingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeatingCharacterSubstring {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("--------enter the string---------");
		String s = sc.next();
		System.out.println(longestSubstring(s));

	}
	private static int longestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left =0,maxLen=0;
		int r=0;
		for(int right =0;right<s.length(); right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			r =right;
			maxLen = Math.max(maxLen, right-left+1);
		}
		System.out.println(s.substring(0, r-left+1));
		return maxLen;
	}
}
