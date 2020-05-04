package may.fourthday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Deb
 * Date : 04/05/2020.
 */
public class ComplementNumberFinder {

    public int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        String complement = Stream.of(binaryNum.split(""))
                .filter(n -> n != null && !"".equalsIgnoreCase(n))
                .map(n -> {

                    if ("1".equalsIgnoreCase(n)) {
                        return "0";
                    } else {
                        return "1";
                    }
                })
                .collect(Collectors.joining());
        return Integer.parseInt(complement, 2);
    }
}
