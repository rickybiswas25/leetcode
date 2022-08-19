package aug2022.splitsubsequence;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/split-array-into-consecutive-subsequences/">...</a>
 *
 * Created by Deb
 *
 * You are given an integer array nums that is sorted in non-decreasing order.
 *
 * Determine if it is possible to split nums into one or more subsequences such that both of the following conditions are true:
 *
 *     Each subsequence is a consecutive increasing sequence (i.e. each integer is exactly one more than the previous integer).
 *     All subsequences have a length of 3 or more.
 *
 * Return true if you can split nums according to the above conditions, or false otherwise.
 *
 * A subsequence of an array is a new array that is formed from the original array by deleting some (can be none) of the elements without disturbing the relative positions of the remaining elements. (i.e., [1,3,5] is a subsequence of [1,2,3,4,5] while [1,3,2] is not).
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,3,4,5]
 * Output: true
 * Explanation: nums can be split into the following subsequences:
 * [1,2,3,3,4,5] --> 1, 2, 3
 * [1,2,3,3,4,5] --> 3, 4, 5
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,3,4,4,5,5]
 * Output: true
 * Explanation: nums can be split into the following subsequences:
 * [1,2,3,3,4,4,5,5] --> 1, 2, 3, 4, 5
 * [1,2,3,3,4,4,5,5] --> 3, 4, 5
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,4,5]
 * Output: false
 * Explanation: It is impossible to split nums into consecutive increasing subsequences of length 3 or more.
 *
 *
 *
 * Constraints:
 *
 *     1 <= nums.length <= 104
 *     -1000 <= nums[i] <= 1000
 *     nums is sorted in non-decreasing order.
 */
public class SplitSubsequence {

    public boolean isPossible(int[] nums) {
        if (nums.length < 3) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(map.keySet().size());
        queue.addAll(map.keySet());

        while (!queue.isEmpty()) {
            int min = queue.peek();
            int count = 0;
            while (true) {
                if (!map.containsKey(min)) {
                    if (count < 3) return false;
                    break;
                }
                map.put(min, map.get(min) - 1);
                count++;
                if (map.get(min) == 0) {
                    if (min != queue.peek()) return false;
                    queue.poll();
                }
                if (map.containsKey(min + 1) && map.get(min) + 1 > map.get(min + 1)) {
                    if (count < 3) return false;
                    break;
                }

                min += 1;
            }
        }

        return true;
    }
}
