package recursion;

import java.util.*;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.next();
		boolean f = checkPalindrom(0, s);
		System.out.println(f);

	}
	private static boolean checkPalindrom(int i, String s) {
		if (i >= s.length()/2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(s.length()-i-1)) {
			return false;
		}
		return checkPalindrom(i+1, s);
		
	}
	

}
