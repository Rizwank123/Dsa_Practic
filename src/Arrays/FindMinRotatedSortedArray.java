package Arrays;




//7. Find the Minimum in Rotated
//Sorted Array
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.




public class FindMinRotatedSortedArray {

	public static void main(String[] args) {
		 int nums[]= {3,4,5,1,2};
		int s=0,e=nums.length-1;
		int min=nums[0];
		
		// min=2
		//s=0 && e=1; true
		while(s<=e) {
			if(nums[s]<=nums[e]) {
				
				//2<=1 false
				min=Math.min(min, nums[s]);
				break;
				
			}
			int mid =(s+e)/2;
			//1
			
			min=Math.min(min, nums[mid]);
			//2
			if(nums[mid]>=nums[s]) {
				//false
				s=mid+1;
			
		
			}
			else {
				e=mid-1;
				//0
			}
	
		}
		System.out.println(min);

		
	}

}
