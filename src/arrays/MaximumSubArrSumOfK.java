package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArrSumOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, -1, 4, -4};
		int[] arr2 = {1, -1, 2, -2 };
		System.out.println("----------------Max Len of sub Array of sum 0-------------------");
		System.out.println(maximumSubArray(arr2));
		System.out.println("--------------------Len Of sub Array of sum if k---------------");
		System.out.println(NumberOfSubArrayOfKSum(arr, 6));
		

	}
	
	private static int maximumSubArray(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum=0;
		int maxLn=0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i] ;
			if(sum == 0) {
				maxLn = i+1;
			}
			if (map.containsKey(sum)) {
				int len = i - map.get(sum);
				maxLn = Math.max(len, maxLn);
			}else {
				map.put(sum, i);
			}
		}
		return maxLn;
	}
	
	private static int NumberOfSubArrayOfKSum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int ans =0;
		int sum =0;
		map.put(0,1);
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(map.containsKey(sum-k)) {
				ans += map.get(sum-k);
			}
			map.put(sum,  map.getOrDefault(sum, 0)+1);
		}
		return ans;
	}
	
	private static int maximumSubArray(int[]arr, int k) {
		return 0;
	}

}
