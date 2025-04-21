package arrays;

import java.util.HashMap;
import java.util.Map;

public class MojarityElement {
	public static void main(String[] args) {
		int[] arr = {4,4,3,4,5,4,3,2,4,4};
		System.out.println(mojarity(arr));
		
	}
	
	private static int mojarity(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int a: arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		System.out.println(map);
		for(int k: map.keySet()) {
			if(map.get(k)> (arr.length)/2) return k;
		}
		return 0;
	}

}
