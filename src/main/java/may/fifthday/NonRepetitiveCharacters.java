package may.fifthday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 05/05/2020.
 *
 *
 *  Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * */
public class NonRepetitiveCharacters {

    public int findNonRepetitiveCharIndex(String s) {
        if (s == null || s.equalsIgnoreCase("")) {
            return -1;
        }
        String[] splittedString = s.split("");
        Map<String, Integer> occurrenceCounter = new HashMap<>();
        Arrays.stream(splittedString)
                .filter(ss -> !ss.equalsIgnoreCase(""))
                .forEach(ss -> occurrenceCounter.merge(ss, 1, Integer::sum));

        return Arrays.stream(splittedString)
                .filter(ss -> occurrenceCounter.get(ss) == 1)
                .map(s::indexOf)
                .findFirst()
                .orElse(-1);
    }
}
