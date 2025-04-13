package sortingAlgo;

import java.util.Arrays;

public class SelecetionSort {

	public static void main(String[] args) {
		int arr[]= {5,2,7,1,9,8,3,4,6};
		System.out.println("Array before Sorting ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array ofter sorting");
		String sortedArray=Arrays.toString(selectionSort(arr));
		System.out.println(sortedArray);
	}
	private static int[] selectionSort(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					c=j;
				}
			}
			int temp=arr[i];
			
			arr[i]=min;
			arr[c]=temp;
			min=Integer.MAX_VALUE;
			
		}
		return arr;
	}

}
