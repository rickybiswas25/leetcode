package may.tweentysecondday;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Deb
 * Date : 22/05/2020.
 */
public class StringSortByFrequency {

    public String sort(String s) {
        if (s == null || "".equalsIgnoreCase(s)) {
            return s;
        }

        String[] splittedArray = s.split("");
        Map<String, String> occurrence = new HashMap<>();
        for (String split : splittedArray) {
            if (!"".equalsIgnoreCase(split)) {
                occurrence.merge(split, split, (a, b) -> a + b);
            }
        }
        Comparator<String> lengthComparator = (o1, o2) -> Integer.compare(o2.length(), o1.length());
        List<String> arrValue = occurrence.values().stream().sorted(lengthComparator).collect(Collectors.toList());
        StringBuilder multipleChar = new StringBuilder();
        for (String st : arrValue) {
            multipleChar.append(st);
        }
        return multipleChar.toString();
    }
}
