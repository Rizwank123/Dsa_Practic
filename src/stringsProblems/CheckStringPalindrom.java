package stringsProblems;

public class CheckStringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(checkPalindrom("oyo"));
	}
	private static boolean checkPalindrom(String str) {
		if(str.length() == 1) return true;
		int s=0, e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)!= str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
