package timeComplexity;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,7,9,0,2};
		System.out.println("-----------Reverse Array---------");
		System.out.println(Arrays.toString(reverse(arr)));
		System.out.println("------------------Find min----------");
		System.out.println(findMin(arr));
		System.out.println("----------------Max Element-------------");
		System.out.println(max(arr));
		System.out.println("-----------------Print pair ------------");
		printPair(arr);

	}
	
	private static int[] reverse(int[] arr) {
		// O(n) time and O(n) space 
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i] = arr[res.length-i-1];
		}
		return res;
	}
	private static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int a: arr) {
			if(a<min) min= a;
		}
		return min;
	}
	
	// O(n^2) time 
	private static void printPair(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	// O(n) time 
	private static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int a: arr) {
			if(a>max) max=a;
		}
		return max;
	}
}
