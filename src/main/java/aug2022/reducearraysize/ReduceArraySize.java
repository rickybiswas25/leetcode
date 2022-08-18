package aug2022.reducearraysize;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/reduce-array-size-to-the-half/">...</a>
 *
 * Created by Deb
 *
 * You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
 *
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,3,3,3,5,5,5,2,2,7]
 * Output: 2
 * Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
 * Possible sets of size 2 are {3,5},{3,2},{5,2}.
 * Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
 *
 * Example 2:
 *
 * Input: arr = [7,7,7,7,7,7]
 * Output: 1
 * Explanation: The only possible set you can choose is {7}. This will make the new array empty.
 *
 *
 *
 * Constraints:
 *
 *     2 <= arr.length <= 105
 *     arr.length is even.
 *     1 <= arr[i] <= 105
 */
public class ReduceArraySize {
    public int reduce(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        map = map.entrySet()
                .stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int count = 1;
        int lengthAfterReplacing = arr.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             lengthAfterReplacing = lengthAfterReplacing - entry.getValue();
             if (lengthAfterReplacing > arr.length / 2) {
                 count++;
             } else {
                 break;
             }
        }
        return count;
    }
}
