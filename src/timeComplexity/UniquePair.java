package timeComplexity;

import java.util.HashSet;
import java.util.Set;

public class UniquePair {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,8,9,0};
		findUniquePair(arr);

	}
	private static void findUniquePair(int[] arr) {
		// O(n) space And O(n^2) time
		Set<String> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(!set.contains(arr[i]+""+arr[j])) {
						System.out.println(arr[i]+" "+arr[j]);
						set.add(arr[i]+" "+arr[j]);
					}
				}
			}
		}
	}

}
