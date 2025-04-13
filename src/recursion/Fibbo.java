package recursion;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
	System.out.println(fibb(n));

	}
	
	private static int fibb(int n) {
		if(n == 1 || n== 0) return n;
		return fibb(n-1)+fibb(n-2);
	}

}
