package aug2022.splitsubsequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/split-array-into-consecutive-subsequences/">...</a>
 *
 * Created by Deb
 *
 */
public class SplitSubsequenceUnitTest {

    private SplitSubsequence split;

    @BeforeEach
    void init() {
        this.split = new SplitSubsequence();
    }

    @Test
    void test1() {
        assertThat(this.split.isPossible(new int[]{1,2,3,3,4,5}))
                .isTrue();
    }

    @Test
    void test2() {
        assertThat(this.split.isPossible(new int[]{1,2,3,3,4,4,5,5}))
                .isTrue();
    }
    @Test
    void test3() {
        assertThat(this.split.isPossible(new int[]{1,2,3,4,4,5}))
                .isFalse();
    }

}
