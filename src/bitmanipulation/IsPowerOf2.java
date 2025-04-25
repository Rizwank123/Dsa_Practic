package bitmanipulation;

import java.util.Scanner;

public class IsPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(isPowerOfTwo(n));
		System.out.println("----------using bit manipulation-------------");
		System.out.println(isPower(n));
	}
	// time complexity is O(log n)
	// Space complexity is O(1)
	private static boolean isPowerOfTwo(int n) {
		if(n<= 0) return false;
		
		if(n==1) return true;
		
		if(n%2 == 0) {
			return isPowerOfTwo(n/2);
		}
		return false;
	}
	// optimize solution using bit manipulation 
	// time complexity is O(1)
	// Space complexity is O(1)
	private static boolean isPower(int n) {
		return n > 0 && (n&(n-1)) ==0;
	}

}
