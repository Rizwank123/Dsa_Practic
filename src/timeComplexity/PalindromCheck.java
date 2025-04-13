package timeComplexity;

//Check if the array is a palindrome
public class PalindromCheck {

	public static void main(String[] args) {
		int[] arr= {1,2,1,1,2,1};
		System.out.println(isPalindrom(arr));
		
	}
	
	private static boolean isPalindrom(int[] arr) {
		if(arr.length == 1) return true;
		
		int s=0, e=arr.length-1;
		while(s<e) {
			if(arr[s]!= arr[e]) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
