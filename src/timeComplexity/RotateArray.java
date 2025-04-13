package timeComplexity;

import java.util.Arrays;

//Left rotate the array by 1 position
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
//		System.out.println("-----------------Original Array------");
//		System.out.println(Arrays.toString(arr));
//		rotateArray(arr);
//		System.out.println("-----------------Rotated Array------");
//		System.out.println(Arrays.toString(arr));
		System.out.println("---------------K Rotated Array--------");
		rotateArrayK(arr, 2);
		//System.out.println(Arrays.toString(arr));

	}
	private static void rotateArray(int[] arr) {
		if(arr.length ==1) return;
		
		int a= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] =arr[i+1];
		}
		arr[arr.length-1] = a;
	}
	// k rotated  arrays
	private static void rotateArrayK(int[] arr, int k) {
		if(arr == null || arr.length == k || k<=0 ) return ;
		
		int n = arr.length;
		k = k%n;
		// Reverse entire array
		reverse(arr, 0, n-1);
		System.out.println("------After step 1-------");
		System.out.println(Arrays.toString(arr));
		// Reverse the first k element
		reverse(arr, 0, k-1);
		System.out.println("-----------After step 2----------");
		System.out.println(Arrays.toString(arr));
		// Reverse the remaining n-k elements
		reverse(arr, k, n-1);
		System.out.println("-----------Final Array----------");
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	private static void reverse(int[] arr, int s, int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

}
