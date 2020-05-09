package may.ninthday;

/**
 * Created by Deb
 * Date : 09/05/2020.
 */
public class SquareFinder {

    public boolean find(int num) {
        if (num < 0) {
            return false;
        }
        int upperLimit = (num / 10) == 0 ? num : num / 3;
        for (int i = 0; i <= upperLimit; i++) {
            int multiply = i * i;
            if (multiply == num) {
                return true;
            } else if (multiply > num) {
                return false;
            }
        }
        return false;
    }
}
