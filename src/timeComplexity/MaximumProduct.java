package timeComplexity;
// Find the maximum product of two integers in an array
public class MaximumProduct {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,7,9,0,8,6,3, 16};
		
		System.out.println(secondMax(arr));
	}
	private static int secondMax(int[] arr) {
		int max1 =Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		for(int a: arr) {
			if(a>max1) {
				max2 = max1;
				max1 =a;
			}else if(a> max2) max2 = a;
		}
		return max1*max2;
	}

}
