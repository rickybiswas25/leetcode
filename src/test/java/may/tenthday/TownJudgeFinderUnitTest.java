package may.tenthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 06/05/2020.
 */
public class TownJudgeFinderUnitTest {
    private TownJudgeFinder finder;

    @BeforeEach
    void init() {
        this.finder = new TownJudgeFinder();
    }

    @Test
    void testCaseWithSingleElements() {
        int[][] trust = new int[][]{{1,2}};
        assertThat(this.finder.find(2, trust))
                .isEqualTo(2);
    }

    @Test
    void testCaseWithMultipleElements1() {
        int[][] trust = new int[][]{{1,3},{2,3}};
        assertThat(this.finder.find(3, trust))
                .isEqualTo(3);
    }

    @Test
    void testCaseWithMultipleElements2() {
        int[][] trust = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        assertThat(this.finder.find(4, trust))
                .isEqualTo(3);
    }

    @Test
    void testCaseWithMultipleElements3() {
        int[][] trust = new int[][]{{1,2},{2,3}};
        assertThat(this.finder.find(3, trust))
                .isEqualTo(-1);
    }




    @Test
    void shouldReturnNegativeWhenJudgeNotFound() {
        int[][] nums = new int[][]{{1,3},{2,3},{3,1}};
        assertThat(this.finder.find(3, nums))
                .isEqualTo(-1);

    }



}
