package recursion;

import java.util.Scanner;

public class IsSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		System.out.println("Enter the Target String");
		String t = sc.next();
		
		System.out.println(subSeq(0,0,s,t));

	}
	private static boolean subSeq(int i, int j, String s, String t) {
		if(i == s.length()) return true;
		if(j == t.length()) return false;
		if(s.charAt(i) == t.charAt(j)) {
			return subSeq(i+1, j+1, s, t);
		}
		return subSeq(i, j+1,s, t);
	}

}
/*
Enter the string: 
abc
Enter the Target String
abcdefgh
true
*/