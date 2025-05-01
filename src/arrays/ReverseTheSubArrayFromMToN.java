package arrays;

import java.util.Arrays;

public class ReverseTheSubArrayFromMToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int m = 6; // Starting index of the subarray
		System.out.println("Original array: "+ Arrays.toString(arr));
		reverseSubArray(arr, m, 8);
	}
	
	private static void reverseSubArray(int[] arr, int m, int n) {
		// Check if m and n are within the bounds of the array
		if (m < 0 || n >= arr.length || m >= n) {
			System.out.println("Invalid indices");
			return;
		}

		// Reverse the subarray from index m to n
		while (m < n) {
			int temp = arr[m];
			arr[m] = arr[n];
			arr[n] = temp;
			m++;
			n--;
		}
		System.out.println("Reversed subarray: "+ Arrays.toString(arr));
	}

}
