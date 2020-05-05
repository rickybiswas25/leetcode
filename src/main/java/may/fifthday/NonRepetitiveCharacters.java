package may.fifthday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 05/05/2020.
 */
public class NonRepetitiveCharacters {

    public int indexFinder(String s) {
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
