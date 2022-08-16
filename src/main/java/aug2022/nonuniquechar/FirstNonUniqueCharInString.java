package aug2022.nonuniquechar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">...</a>
 *
 * Created by Deb
 *
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 105
 *     s consists of only lowercase English letters.
 * */
public class FirstNonUniqueCharInString {


    public int find(String s) {
        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        IntStream.rangeClosed(0, s.length() - 1)
                .forEach(c -> occurrences.merge(s.charAt(c), 1, Integer::sum));
        return occurrences.entrySet().stream()
                .filter(item -> item.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .map(s::indexOf)
                .orElse(-1);
    }
}
