package dynomincProgramming;

import java.util.Arrays;

public class HouseRobberII {

	public static void main(String[] args) {
		int[] house1 = {1,2,3,1};
		int[] house2 = {2,3,2};
		
		System.out.println(rob2(house1));
		System.out.println(rob2(house2));
		
	}
	public static int rob2(int[] house) {
		int n=house.length;
		if(n==0) return 0;
		else if(n==1) return house[0];
		else if(n==2) return Math.max(house[0], house[1]);
		
		return Math.max(robLiner(Arrays.copyOfRange(house,0,n-1)),robLiner(Arrays.copyOfRange(house, 1, n)));
		
	}
	public static int robLiner(int[] house) {
		int n=house.length;
		int [] dp=new int[n];
		dp[0]=house[0];
		dp[1]=Math.max(house[0], house[1]);
		for(int i=2;i<n;i++) {
			dp[i]=Math.max(dp[i-1],dp[i-2]+house[i]);
		}
		return dp[n-1];
	}

}
