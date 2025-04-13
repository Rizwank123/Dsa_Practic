//You are given an array of words where each word consists of lowercase English letters.
//
//wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.
//
//    For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
//
//A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
//
//Return the length of the longest possible word chain with words chosen from the given list of words.
//
// 
//
//Example 1:
//
//Input: words = ["a","b","ba","bca","bda","bdca"]
//Output: 4
//Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
//
//Example 2:
//
//Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
//Output: 5
//Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc", "pcxbc", "pcxbcf"].
//
//Example 3:
//
//Input: words = ["abcd","dbqca"]
//Output: 1
//Explanation: The trivial word chain ["abcd"] is one of the longest word chains.
//["abcd","dbqca"] is not a valid word chain because the ordering of the letters is changed.

 




package dynomincProgramming;

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] arr = {"a","b","ba","bca","bda","bdca"};
        System.out.println(longestStringChain(arr));
    }

    private static int longestStringChain(String[] str) {
        Arrays.sort(str, (a, b) -> a.length() - b.length());

        int[] dp = new int[str.length];
        Arrays.fill(dp, 1); // Initialize all lengths to 1

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < i; j++) {
                if (isPredecessor(str[j], str[i])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxChainLength = 0;
        for (int length : dp) {
            maxChainLength = Math.max(maxChainLength, length);
        }

        return maxChainLength;
    }

    private static boolean isPredecessor(String s1, String s2) {
        if (s2.length() != s1.length() + 1) {
            return false;
        }

        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }
}
