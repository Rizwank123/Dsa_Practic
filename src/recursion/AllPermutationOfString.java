package recursion;

import java.util.Scanner;

public class AllPermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String Here: ");
		String s = sc.next();
		permute(s, 0);
		

	}
	// Time: O(n!) — there are n! permutations for a string of length n
	// Space: O(n) recursion stack (ignoring output)
	private static void permute(String s, int index) {
		if(index == s.length()) {
			System.out.println(s);
			return ;
		}
		for(int i = index; i<s.length();i++) {
			char[] charArr = s.toCharArray();
			swap(charArr, index, i);
			permute(new String(charArr), index+1);
			swap(charArr, index, i);
		}
	}
	
	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
