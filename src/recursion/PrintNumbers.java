package recursion;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= sc.nextInt();
		System.out.println("printing n to 1");
		printNToOne(1, n);
		System.out.println("printing 1 to n");
		printOneToN(1, n);
		// backtracking
		System.out.println("backtracking print 1 to n");
		printOneToNBackTrack(n, n);
		System.out.println("Backtracking prnt n to 1");
		printNToOneBacktraking(n, n);
		System.out.println("Sum of n numbers ");
		System.out.println(sumOfN( n));
		System.out.println("factorial number");
		System.out.println(factorial(n));

	}
	// print the number n to 1 in 
	private static void printNToOne(int i, int n) {
		if(i> n) return;
		System.out.println(n);
		printNToOne(i, n-1);
		
	}
	
	// print 1 to n 
	private static void printOneToN(int i, int n) {
		if(i>n) {
			return ;
		}
		System.out.println(i);
		printOneToN(i+1, n);
	}
	// backTracking print 1 to n
	private static void printOneToNBackTrack(int i, int n) {
		if(i< 1) return;
		printOneToNBackTrack(i-1, n);
		System.out.println(i);
	}
	
	// Backtracking print n to 1
	private static void printNToOneBacktraking(int i, int n) {
		if(i< 1) return;
		System.out.println(i);
		printNToOneBacktraking(i-1, n);
	}
	
	// Sum of n numbers 
	private static int sumOfN(int n) {
		if(n==0) return 0;
		return n+sumOfN(n-1);
		
		
	}
	
	// Factorial of number 
	private static int factorial(int n) {
		if(n==0) return 1;
		return n*factorial(n-1);
	}

}
