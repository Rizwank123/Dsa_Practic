package arrays;

public class PrintTriplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,4,7,8,3,9};
		triplate(arr);

	}
	// Time complexity O(n^3)
	// Space complexity O(1)
	private static void triplate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<  arr.length; j++) {
				for(int k=j+1;k<arr.length;k++) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}

}
