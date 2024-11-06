package leetcode.practice.slidingwindow.category.easy;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
 *
 * Problem Statement: You are given an integer array nums consisting of n elements, and an integer k.Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 *
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 *
 * Constraints:
 * n == nums.length
 * 1 <= k <= n <= 105
 * -104 <= nums[i] <= 104
 */

/**
 * time complexity - O(n)
 * space complexity - O(1)
 */
public class MaximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int currenRunningSum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        for(int start = 0; start < nums.length; start++) {
            currenRunningSum += nums[start];
            if(start >= k-1) {
                double currentAvg = (double) currenRunningSum / k;
                maxAvg = Math.max(currentAvg, maxAvg);
                currenRunningSum -= nums[start - (k-1)];
            }
        }
        return maxAvg;
    }
}
