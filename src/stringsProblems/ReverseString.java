package stringsProblems;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(revers("hello"));

	}
	
	private static String revers(String str) {
		char[] arr = str.toCharArray();
		for(int i=0, j=arr.length-1; i<j;i++, j--) {
			char temp = arr[i]; 
			arr[i] = arr[j];
			arr[j] =temp;
		}
		return new String(arr);
	}

}
