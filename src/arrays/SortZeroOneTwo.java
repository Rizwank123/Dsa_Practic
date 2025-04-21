package arrays;

import java.util.Arrays;

// Sort Ducth Flag Algorithm
public class SortZeroOneTwo {

	public static void main(String[] args) {
		int[] arr= {2, 0, 2, 1, 1, 0};
		System.out.println("------------Before Sorting-------");
		System.out.println(Arrays.toString(arr));
		sortArr(arr);
		System.out.println("------------After Sorting-------");
		System.out.println(Arrays.toString(arr));
		
	}
	private static void sortArr(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0:
				swap(arr, low,mid);
				low++;
				mid++;
				break;
			case 1: 
				mid++;
				break;
			case 2:
				swap(arr, high, mid);
				high--;
				break;
			}
		}
	}
	private static void swap(int[]arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}

}
