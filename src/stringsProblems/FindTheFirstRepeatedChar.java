package stringsProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTheFirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------enter the string--------");
		String s = sc.next();
		// TODO Auto-generated method stub
		System.out.println(repeatedChar(s));

	}
	
	private static char repeatedChar(String s) {
		Set<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			if(set.contains(c)) return c;
			set.add(c);
			
		}
		return ' ';
	}
}
