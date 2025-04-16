package stringsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnangrams {

	public static void main(String[] args) {
		String[] arr = {"cat", "eat", "net", "ten", "tea"};
		System.out.println(groupOfAnagram(arr));
		System.out.println("----optimize Approch----");
		System.out.println(anagramsGroup(arr));

	}

   // Time complexity: O(m∗nlog⁡n)
   // Space complexity: O(m∗n)

	private static List<List<String>> groupOfAnagram(String[] strArr){
		
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strArr) {
			char[] charArr = s.toCharArray();
			Arrays.sort(charArr);
			String sortedStr = new String(charArr);
			map.putIfAbsent(sortedStr, new ArrayList<>());
			map.get(sortedStr).add(s);
		}
		return new ArrayList<>(map.values());
	}
	
	// Time complexity: O(m∗n)
	// O(m) extra space 
	// Space complexity: O(m∗n) for  output list
	private static List<List<String>> anagramsGroup(String[] strs){
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strs) {
			int[] count = new int[26];
			for(char c: s.toCharArray()) {
				count[c-'a']++;
			}
			String key = Arrays.toString(count);
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(s);
		}
		return new ArrayList<>(map.values());
	}

}
