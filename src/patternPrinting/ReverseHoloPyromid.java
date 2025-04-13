package patternPrinting;

import java.util.Scanner;

public class ReverseHoloPyromid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		printPattern(n);


	}
	private static void printPattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
