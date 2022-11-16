package challenge4;

import java.util.List;

/**
 * Programming Club 11/16/2022
 * Code Challenge 4
 * 
 * This week's coding challenge are interview challenges compiled from leetcode.com.
 * Each method increases in difficulty starting with a warm-up. The link to each problem
 * will be posted in each method if you'd prefer to solve it directly on the website!
 * 
 * @author your_name_here
 */
public class Challenge4 {

	/**
	 * You are given a large integer represented as an integer array digits, where each 
	 * digits[i] is the ith digit of the integer. The digits are ordered from most significant 
	 * to least significant in left-to-right order. The large integer does not contain any 
	 * leading 0's. Increment the large integer by one and return the resulting array of digits.
	 * 
	 * Source: https://leetcode.com/problems/plus-one/
	 * 
	 * EXAMPLE:
	 * Input: digits = [1,2,3]
	 * Output: [1,2,4]
	 * Explanation: The array represents the integer 123.
	 * Incrementing by one gives 123 + 1 = 124.
	 * Thus, the result should be [1,2,4].
	 * 
	 * @param digits array of integers
	 * @return an incremented version of digits
	 */
	public static int[] plusOne(int[] digits) {
        return null;
    }
	
	/**
	 * Given an array nums of distinct integers, return all the possible permutations. You can 
	 * return the answer in any order.
	 * 
	 * Source: https://leetcode.com/problems/permutations/
	 * 
	 * EXAMPLE:
	 * Input: nums = [1,2,3]
	 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
	 * 
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> permute(int[] nums) {
        return null;
    }
	
	/**
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of 
	 * the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	 * 
	 * Source: https://leetcode.com/problems/median-of-two-sorted-arrays/
	 * 
	 * EXAMPLE:
	 * Input: nums1 = [1,2], nums2 = [3,4]
	 * Output: 2.50000
	 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }
	
	//==================================TEST CLIENT========================================
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3};
		int[] num2 = {1, 9};
		int[] num3 = {1, 4};
		
		// plusOne tests
		System.out.println("plusOne tests:");
		System.out.println("--------------");
		System.out.println("Expected: [1, 2, 4]");
		System.out.println("Actual: " + Arrays.toString(plusOne(num1)) + "\n\n");
		
		// permute tests
		System.out.println("permute Tests:");
		System.out.println("--------------");
		System.out.println("Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]");
		System.out.println("Actual: " + permute(num1) + "\n\n");
		
		// findMedianSortedArrays
		System.out.println("findMedianSortedArrays test1 (odd array length):");
		System.out.println("------------------------------------------------");
		System.out.println("Arrays Used: [1, 2, 3] and [1, 9]");
		System.out.println("Merged Array: [1, 1, 2, 3, 9]");
		System.out.println("Expected: 2");
		System.out.println("Actual: " + findMedianSortedArrays(num1, num2) + "\n\n");
		
		System.out.println("findMedianSortedArrays test2 (even array length):");
		System.out.println("-------------------------------------------------");
		System.out.println("Arrays Used: [1, 9] and [1, 4]");
		System.out.println("Merged Array: [1, 1, 4, 9]");
		System.out.println("Expected: 2.5");
		System.out.println("Actual: " + findMedianSortedArrays(num2, num3));
		
	}

}
