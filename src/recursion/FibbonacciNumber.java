package recursion;

import java.util.Scanner;

public class FibbonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(fibb(n));

	}
	private static int fibb(int n) {
		if(n == 0 || n == 1 ) return n;
		return fibb(n-1)+fibb(n-2);
	}

}
