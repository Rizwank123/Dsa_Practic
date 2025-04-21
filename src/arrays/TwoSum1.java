package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

	public static void main(String[] args) {
		int[] arr = {1,4,6,8,0,9,5,3,2};
		int k= 12;
		System.out.println(Arrays.toString(twoSum(arr, k)));

	}
	private static int[] twoSum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int comp = k-arr[i];
			if(map.containsKey(comp)) {
				return new int[] { map.get(comp),i};
			}else {
				map.put(arr[i], i);
			}
		}
		return new int[] {};
				
	}

}
