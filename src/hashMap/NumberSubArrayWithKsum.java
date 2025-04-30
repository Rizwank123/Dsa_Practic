package hashMap;

import java.util.HashMap;
import java.util.Map;

public class NumberSubArrayWithKsum {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1};
		int k =2;
		System.out.println(subArrayWithKsum(arr, k));
	}
	private static int subArrayWithKsum(int[]arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int ans =0;
		int sum =0;
		map.put(0, 1);
		for(int a: arr) {
			sum += a;
			if(map.containsKey(sum - k)) {
				ans += map.get(sum - k);
			}
			map.put(sum,  map.getOrDefault(sum, 0) + 1);
		}
		return ans;
	}

}
