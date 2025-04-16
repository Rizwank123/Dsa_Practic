package recursion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(0, 4, "madsm"));

	}
	
	private static boolean isPalindrome(int l, int r, String s) {
		if(l>=r) return true;
		if(s.charAt(l)!= s.charAt(r)) {
			return false;
		}
		return isPalindrome(l+1, r-1, s);
	}

}
