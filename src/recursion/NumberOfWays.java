package recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> memo = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(ways(n, memo));

	}
	//
    //Time Complexity: O(n)
    //Space Complexity: O(n)

	private static int ways(int n, Map<Integer, Integer> memo) {
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		if(n == 0) return 1;
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(n == 3) return 4;
		int result = ways(n-1, memo)+ways(n-2, memo)+ways(n-3, memo);
		memo.put(n, result);
		return result;
	}

}
