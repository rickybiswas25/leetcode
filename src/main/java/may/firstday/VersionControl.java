package may.firstday;

/**
 * Created by Deb
 * Date : 03/05/2020.
 */
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
