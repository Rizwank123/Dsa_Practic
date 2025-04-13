package timeComplexity;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5,6,7,7,8};
		System.out.println("----------before removing duplicates-----");
		System.out.println(Arrays.toString(arr));
	int	a=removeDuplicate(arr);
		System.out.println("----------After removing duplicates-----");
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	// Remove duplicates from a sorted array (in-place)
	private static int removeDuplicate(int[] arr) {
		if(arr.length==0) return 0;
		int index =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[index]) {
				index++;
				arr[index] = arr[i];
			}
		}
		return index+1;
	}
}
