package recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibbonacciUsingMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(fibb(n, map));

	}
 private static int fibb(int n, Map<Integer, Integer> map) {
	 if(map.containsKey(n)) return map.get(n);
	 
	 if(n<= 0) return 0;
	 if(n == 1) return 1;
	 int result = fibb(n-1, map) + fibb(n-2, map);
	 map.put(n, result);
	 return result;
 }
}

