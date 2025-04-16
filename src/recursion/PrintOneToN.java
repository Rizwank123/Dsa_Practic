package recursion;

import java.util.Scanner;

public class PrintOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the number");
		int n = sc.nextInt();
		printN(n);

	}
	
	private static void printN(int n) {
		if(n==0) {
			return ;
		}
		printN(n-1);
		System.out.println(n);
	}

}
