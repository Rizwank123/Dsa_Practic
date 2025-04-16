package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(fact(n));
		
	}
	private static int fact(int n) {
		if(n==0) return 1;
		return n * fact(n-1);
	}

}
