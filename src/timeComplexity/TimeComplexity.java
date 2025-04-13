package timeComplexity;

public class TimeComplexity {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,9,0,2};
		System.out.println("------------Print first element ------------");
		System.out.println(getFirstElement(arr));
		System.out.println("---------------Print Sum----------------");
		System.out.println(sum(arr));
		System.out.println("-----------------Print all Pairs---------------");
		printAllPairs(arr);
		System.out.println("----End------");
		
	}
	
	// O(1) - Constant Time
	
	private static int getFirstElement(int[] arr) {
		return arr[0];
	}
	
	// O(n) - Linear Time
	private static int sum(int[] arr) {
		int ans =0;
		for(int a: arr) ans+=a;
		return ans;
	}
	
	// O(n^2) - Quadratic Time
	
	private static void printAllPairs(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

}
