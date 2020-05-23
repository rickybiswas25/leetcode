package may.tweentythirdday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 24/05/2020.
 */
public class IntersectionFinderUnitTest {
    private IntersectionFinder finder;

    @BeforeEach
    void init() {
        this.finder = new IntersectionFinder();
    }

    @Test
    void testIntervalIntersection() {
        int[][] A = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] B = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        int[][] ans = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};

        assertThat(this.finder.intervalIntersection(A, B))
                .isEqualTo(ans);
    }
}
