package hashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(arr));

	}
	private static int longestConsecutive(int[] arr) {
		if (arr.length == 1) {
			return 1;
		}
		int maxLen = 0;
		
		Set<Integer> set = new HashSet<>();
		
		for(int a : arr) set.add(a);
		for(int a: arr) {
			if(!set.contains(a-1)) {
				int curr =a;
				int len =1;
				
				while(set.contains(curr+1)) {
					curr++;
					len++;
				}
				maxLen = Math.max(len, maxLen);
			}
		}
		return maxLen;
	}

}
