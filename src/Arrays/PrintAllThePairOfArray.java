package Arrays;

public class PrintAllThePairOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,7,9,3,2,6};
		printAllPairWithEvenSum(arr);
	}

	// Print all pairs in an array that sum up to an even number.
	private static void printAllPairWithEvenSum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])%2 ==0) {
					System.out.println(arr[i] +" "+ arr[j]);
				}
			}
		}
	}
}
