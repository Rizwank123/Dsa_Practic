package arrays;

// Find Maximum Sub Array Sum 
public class KadanzAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,6,8,0,9,5,3,2};
		System.out.println(maxSubArraySum(arr));

	}
	private static int maxSubArraySum(int arr[]) {
		int max_so_for = arr[0];
		int max_end_here =  arr[0];
		for(int i=1;i<arr.length;i++) {
			max_end_here = Math.max(max_end_here+arr[i], arr[i]);
			max_so_for = Math.max(max_so_for, max_end_here);
		}
		return max_so_for;
	}

}
