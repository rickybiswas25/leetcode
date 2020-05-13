package may.thirteenthday;

/**
 * Created by Deb
 * Date : 13/05/2020.
 *
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 */
public class SmallestNumberFinder {

    public String find(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        StringBuilder smallestNumberBuilder = new StringBuilder(num);
        for (int j = 0; j < k; j++) {
            int i = 0;
            while (i < smallestNumberBuilder.length() - 1 && smallestNumberBuilder.charAt(i) <= smallestNumberBuilder.charAt(i + 1)) {
                i++;
            }
            smallestNumberBuilder.delete(i, i + 1);
        }

        while (smallestNumberBuilder.length() > 1 && smallestNumberBuilder.charAt(0) == '0') {
            smallestNumberBuilder.delete(0, 1);
        }

        if (smallestNumberBuilder.length() == 0) {
            return "0";
        }

        return smallestNumberBuilder.toString();
    }
}
