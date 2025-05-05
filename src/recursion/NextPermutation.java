package recursion;
public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        nextPermutation(arr);
        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Time: O(n)
    // Space: O(1)
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If the entire array is non-increasing, reverse it
        if (i < 0) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the rightmost element that is greater than nums[i]
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Step 4: Swap the pivot with the rightmost successor
        swap(nums, i, j);

        // Step 5: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    // Helper method to swap elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}