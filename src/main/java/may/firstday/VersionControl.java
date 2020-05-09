package may.firstday;

/**
 * Created by Deb
 * Date : 03/05/2020.
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 * */
public class VersionControl {
    private static final int VERSION_MIN = 1;
    private static final int VERSION_MAX = 100;
    protected int badVersions;

    public VersionControl() {
        this.badVersions = (int) (Math.random() * ((VERSION_MAX - VERSION_MIN) + 1)) + VERSION_MIN;
    }

    protected boolean isBadVersion(int version) {
        return this.badVersions == version;
    }

    int findFirstBadVersion(int n) {
        return 0;
    }

}
