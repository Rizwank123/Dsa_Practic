package recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		swapArr(0, arr.length-1, arr);
		System.out.println(Arrays.toString(arr));
	}
	private static void swapArr(int i, int j, int[] arr) {
		if(i>j) return ;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		swapArr(i+1, j-1, arr);
	}

}
