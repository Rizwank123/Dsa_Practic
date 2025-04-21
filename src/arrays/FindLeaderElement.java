package arrays;

public class FindLeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 15, 20, 25, 1, 14, 13, 20};
		System.out.println();
//		findLeader(arr);
		printLeaders(arr);
	}
	// BruteForce Approach O(n) time
	private static void findLeader(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int j;
			for( j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) break;
			}
			if(j == arr.length) {
				System.out.println(arr[i] );
			}
		}
	}
	private static void printLeaders(int[] arr) {
		int max_till = arr[arr.length-1];
		System.out.println(max_till);
		for(int i=arr.length-2;i>=0; i--) {
			if(max_till< arr[i]) {
				max_till = arr[i];
				System.out.println(max_till);
			}
		}
	}

}
