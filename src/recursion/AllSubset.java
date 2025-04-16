package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> subsets = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();
		generateSubsets(input, "", 0, subsets);
		System.out.println(subsets);

	}
	private static void generateSubsets(String s, String curr, int index, List<String> subsets ) {
		
		if(index == s.length()) {
			subsets.add(curr);
			return ;
		}
		
		// include  current character
		
		generateSubsets(s, curr+s.charAt(index), index+1, subsets);
		
		// Exclude current character
		generateSubsets(s, curr, index+1, subsets);
		
	}

}
