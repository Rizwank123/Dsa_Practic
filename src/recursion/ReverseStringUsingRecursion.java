package recursion;

import java.util.Scanner;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String s = sc.next();
		
		System.out.println(reverse(s.toCharArray(), 0, s.length()-1));

	}
	
	private static String reverse(char[] str, int i, int j) {
		if(i>j) {
			return  new String(str);
		}
		
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		
		return reverse(str, i+1, j-1);
		
	}

}
