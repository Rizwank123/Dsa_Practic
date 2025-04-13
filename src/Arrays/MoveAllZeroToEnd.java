package Arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,3,0,4,0,2,6,8,0,9};
		System.out.println("------Before Shifting---------");
		System.out.println(Arrays.toString(arr));
		System.out.println("------------After Shifting---------");
		moveZeroToEnd(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	private static void moveZeroToEnd(int[] arr) {
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0 ) {
				arr[index] = arr[i];
				index++;
			}
		}
		for(int i=index;i<arr.length;i++) {
			arr[i] =0;
		}
	}

}
