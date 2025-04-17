package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disk: ");
		int n = sc.nextInt();
		int count[]= {0};
		hanoi(n, "A", "T", "B", count);
		System.out.println("Number of Moves: " +count[0]);

	}
	
	private static void hanoi(int n, String source, String target, String aux, int[] count) {
		
		if(n==1) {
			count[0]++;
			System.out.println("moving disk 1 from "+source +" to "+ target);
			return;
		}
		hanoi(n-1, source, aux, target, count);
		count[0]++;
		System.out.println("move disk "+n +"from "+source+" to "+target);
		hanoi(n-1, aux, target, source, count);
	}

}
