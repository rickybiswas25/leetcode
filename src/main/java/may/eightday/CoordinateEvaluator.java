package may.eigthday;

import java.text.DecimalFormat;

/**
 * Created by Deb
 * Date : 08/05/2020.
 */
public class CoordinateEvaluator {
    public boolean evaluate(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x2 = coordinates[i][0];
            int y2 = coordinates[i][1];
            int s = calculateDistanceBetweenPoints(x, y, x1, y1, x2, y2);
            if (s != 0) {
                return false;
            }
        }
        return true;
    }

    public int calculateDistanceBetweenPoints(int x, int y, int x1, int y1, int x2, int y2) {
        return (y2 - y1) * x + (x1 - x2) * y + (x2 * y1 - x1 * y2);

    }
}
