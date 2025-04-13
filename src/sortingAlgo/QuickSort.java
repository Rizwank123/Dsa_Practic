package sortingAlgo;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {5,3,6,1,7,2,4};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int arr[],int low,int high) {
		
		if(low<high) {
			int pivote=partation(low,high,arr);
			quickSort(arr, low, pivote-1);
			quickSort(arr, pivote+1, high);
		}
	}
	public static int partation(int low,int high,int[] arr) {
		
		int pivote=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivote) {
				i++;
				swap(i,j,arr);
			}
		}
		swap(i+1,high,arr);
		return i+1;
	}
	public static void swap(int i,int j,int arr[]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}
