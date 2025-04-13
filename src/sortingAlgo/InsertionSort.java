package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {5,2,7,1,9,8,3,4,6};
		System.out.println("Array before Sorting ");
		System.out.println(Arrays.toString(arr));
		
		String ans=Arrays.toString(insertionSort(arr));
		System.out.println("After sorting ");
		System.out.println(ans);

	}
	private static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		return arr;
	}

}
