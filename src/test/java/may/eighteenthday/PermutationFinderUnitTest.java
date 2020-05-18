package eighteenthday;

import may.eighteenthday.PermutationFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 18/05/2020.
 */
public class PermutationFinderUnitTest {
    private PermutationFinder finder;

    @BeforeEach
    void init() {
        this.finder = new PermutationFinder();
    }

    @Test
    void test1() {
        assertThat(this.finder.findPermutation("ab", "eidbaooo"))
                .isTrue();
    }

    @Test
    void test2() {
        assertThat(this.finder.findPermutation("ab", "eidboaoo"))
                .isFalse();
    }



}
