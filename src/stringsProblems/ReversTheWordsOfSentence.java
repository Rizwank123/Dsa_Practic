package stringsProblems;

import java.util.Arrays;

public class ReversTheWordsOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("I love Java"));
		

	}
	private static String reverse(String s) {
		String[] arr = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1;i>=0; i--) {
			
			
			sb.append(arr[i]+" ");
		}
		return sb.toString();
	}

}
