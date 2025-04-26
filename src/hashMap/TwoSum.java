

package hashMap;


import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = findTwoSum(arr, target);
		if (result != null) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two numbers add up to the target.");
		}
	}

	public static int[] findTwoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}

		return null; // Return null if no solution is found
	}
}
