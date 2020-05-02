package may.firstday;

/**
 * Created by Deb
 * Date : 03/05/2020.
 */
public class VersionControlManager extends VersionControl {

    @Override
    public int findFirstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
