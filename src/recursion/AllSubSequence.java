package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequence {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> sq = new ArrayList<>();
        subSeq(0, arr.length, arr, sq);
    }

    private static void subSeq(int i, int n, int[] arr, List<Integer> sq) {
        if (i == n) {
            // Print the current subsequence
            if (sq.isEmpty()) {
                System.out.print("{}");
            } else {
                
                for (int a : sq) {
                    System.out.print(a + " ");
                }
                
            }
            System.out.println(); // New line after printing the subsequence
            return;
        }

        // Exclude the current element
        subSeq(i + 1, n, arr, sq);

        // Include the current element
        sq.add(arr[i]);
        subSeq(i + 1, n, arr, sq);

        // Backtrack: remove the last added element
        sq.remove(sq.size() - 1);
    }
}