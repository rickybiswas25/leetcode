package may.fifteenthday;

/**
 * Created by Deb
 * Date : 15/05/2020.
 */
public class CircularSubArrayMax {
    public int maxSubarraySumCircular(int[] A) {
        if (A == null || A.length == 0) return 0;

        int maxTillHere = A[0];
        int maxInTotal = A[0];

        int minTillHere = A[0];
        int minInTotal = A[0];
        int sum = A[0];

        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            maxTillHere = Math.max(maxTillHere + A[i], A[i]);
            maxInTotal = Math.max(maxInTotal, maxTillHere);

            minTillHere = Math.min(minTillHere + A[i], A[i]);
            minInTotal = Math.min(minInTotal, minTillHere);
        }

        if (sum - minInTotal == 0) return maxInTotal;
        return Math.max(sum - minInTotal, maxInTotal);
    }
}
