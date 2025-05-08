package dynomincProgramming;

import java.util.Arrays;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] height = {30, 10, 60, 10, 60, 50};
            int n = height.length;
//            System.out.println(minJump(n-1, height));
            int[] dp = new int[n+1];
            Arrays.fill(dp, -1);
            System.out.println(minJumpDp(n-1, height, dp));
        }
	// O(n)^2 time complexity
 private static int minJump(int idx, int[] arr) {
	 if(idx == 0) return 0;
	 int left = minJump(idx-1, arr) + Math.abs(arr[idx]-arr[idx-1]);
	 int right = Integer.MAX_VALUE;
	 if(idx > 1) right = minJump(idx-2, arr) + Math.abs(arr[idx] - arr[idx-2]);
	 return Math.min(left, right);
 }
	
 private static int minJumpDp(int idx, int[] arr, int[] dp) {
	 if(idx == 0) return 0;
	 if(dp[idx] != -1) return dp[idx];
	 
	 int left = minJumpDp(idx - 1, arr, dp) + Math.abs(arr[idx] - arr[idx-1]);
	 int right = Integer.MAX_VALUE;
	 if(idx > 1 ) right = minJumpDp(idx-2, arr, dp) + Math.abs(arr[idx] -arr[idx-2]);
	 return dp[idx] = Math.min(left, right);
 }
	
}
