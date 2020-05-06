package may.sixthday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 06/05/2020.
 */
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
