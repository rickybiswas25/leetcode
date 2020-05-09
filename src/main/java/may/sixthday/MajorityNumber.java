package may.sixthday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 06/05/2020.
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * */
public class MajorityNumber {

    public int find(int[] nums) {
        Map<Integer, Integer> occurrenceCounter = new HashMap<>();
        int majorityCriteriaNumber = nums.length / 2;
        Arrays.stream(nums)
                .forEach(num -> occurrenceCounter.merge(num, 1, Integer::sum));

        return occurrenceCounter.entrySet().stream()
                .filter(entry -> entry.getValue() > majorityCriteriaNumber)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);

    }
}
