package recursion;

import java.util.ArrayList;
import java.util.List;

// find the sub swqunce which sum is k
public class FinSubSequence {

	public static void main(String[] args) {
		
		int[]  arr = {1,3,4,5,6,7};
		int k= 8;
		List<Integer> ans = new ArrayList<>();
		subSeq(0, arr, k, ans, 0);
	}
	private static void subSeq(int i, int[] arr, int k , List<Integer> ans, int sum) {
		int n= arr.length;
		if(i == n) {
			if(sum == k) {
				for(int a: ans) {
					System.out.print(a+" ");
				}
				System.out.println();
			}
			return ;
		}
		sum+=arr[i];
		ans.add(arr[i]);
		// include 
		subSeq(i+1, arr, k, ans, sum);
		sum-= arr[i];
		ans.remove(ans.size()-1);
		// exclude
		subSeq(i+1, arr, k,ans, sum);
	}

}

/*
                 subSeq(0, [], 0)
                 /          \
       Include 1             Exclude 1
       [1], 1                [], 0
      /    \                 /    \
  Include 3  Exclude 3  Include 3  Exclude 3
  [1,3],4   [1],1       [3],3     [],0
 /   \      /   \       /   \     /   \
...
*/
