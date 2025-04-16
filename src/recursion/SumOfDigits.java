package recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println(sumOfDigits(n));

	}
	private static int sumOfDigits(int n) {
		if(n==0) return 0;
		return n + sumOfDigits(n-1);
	}

}
