package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,8,0,-3,-6,7,9,11};
		System.out.println(secondLargest(arr));

	}
	
	private static int secondLargest(int[] arr) {
		if(arr.length<2) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int max2 = 0;
		for(int a: arr) {
			if(a> max) {
				max2 = max;
				max = a;
			}else if(a > max2) {
				max2 =a;
			}
		}
		return max2;
		
	}

}
