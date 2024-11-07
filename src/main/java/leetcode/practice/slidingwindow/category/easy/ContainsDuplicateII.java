package leetcode.practice.slidingwindow.category.easy;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=sliding-window&difficulty=EASY
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *   Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 *   Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 */

/**
 * sliding window with auxilary data structure
 *
 * always consider HashMap or Hashset for duplicate problems
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> window =  new HashMap<>();
        for (int i =0;i<nums.length;i++) {
            if (window.containsKey(nums[i]) && (i -window.get(nums[i])) <=k) return true;
            window.put(nums[i],i);
        }
        return false;
    }
}
