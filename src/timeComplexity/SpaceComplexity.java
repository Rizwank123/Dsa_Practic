package timeComplexity;

import java.util.Arrays;

public class SpaceComplexity {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,9,0,2};
			System.out.println("------------Print Array---------");
			printArray(arr);
			System.out.println("----------copying Array-----------\n");
			System.out.println(Arrays.toString(copyArray(arr)));
		}
	
	// O(1) space - No extra space used
	private static void printArray(int[] arr) {
	    for (int num : arr) {
	        System.out.println(num);
	    }
	}

	// O(n) space - Uses new array
	private static int[] copyArray(int[] arr) {
	    int[] copy = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        copy[i] = arr[i];
	    }
	    return copy;
	}

}
