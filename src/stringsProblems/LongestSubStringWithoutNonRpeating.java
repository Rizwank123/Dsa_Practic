package stringsProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutNonRpeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(nonRpeatingLongestSubstring("xyzxyzx"));
		System.out.println(maxUniqueSubstringLength("xyzxyzx"));
		
	}
	// O(N^2) time complexity
	// O(min(n,m)) space complexity;
	private static int nonRpeatingLongestSubstring(String s) {
		if(s.length()==0) return 0;
		int ans =0;
		for(int i=0;i<s.length();i++) {
			Set<Character>  set = new HashSet<>();
			for(int j=i;j<s.length();j++) {
				if(set.contains(s.charAt(j))) break;
				set.add(s.charAt(j));
				ans = Math.max(ans, set.size());
			}
		}
		return ans;
	}
	// O(n) time complexity
	// O(min(n,m)) spcae complexity
	private static int maxUniqueSubstringLength(String s) {
		
		int ans=0,left =0;
		Set<Character> set = new HashSet<>();
		for(int right=0;right<s.length();right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			ans = Math.max(ans, right-left+1);
		}
		return ans;
	}

}
