package timeComplexity;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,7,9,0,8,6,3, -1};
		findSmallestEl(arr);
	}
	private static void findSmallestEl(int[] arr) {
		int s = Integer.MAX_VALUE, m=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> m) m= arr[i];
			if(arr[i]<s) s= arr[i];
		}
		
		System.out.println("Smallest Element: "+s +"  LargestElement: "+m);
	}
}
