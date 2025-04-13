package sortingAlgo;

public class Merg_Sort {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 7, 1, 9, 8, 3, 4, 6};
        System.out.println("Array before Sorting ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting ");
        printArray(arr);
		
	}
	private static void printArray(int[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	private static void mergeSort(int[] arr,int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			mergeSort(arr,left,mid,right);
		}
	}
	private static void mergeSort(int[] arr,int left,int mid,int right) {
		
		
	}

}
