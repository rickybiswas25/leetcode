package may.twelfthday;

import may.twelfth.SingleElementFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 12/05/2020.
 */
public class SingleElementFinderUnitTest {

    private SingleElementFinder finder;

    @BeforeEach
    void init() {
        this.finder = new SingleElementFinder();
    }

    @Test
    void testForOneElement() {
        int[] nums = new int[]{1};
        assertThat(this.finder.find(nums))
                .isEqualTo(1);
    }

    @Test
    void testWhenSingleElementIsInLast() {
        int[] nums = new int[]{1, 1, 2};
        assertThat(this.finder.find(nums))
                .isEqualTo(2);
    }

}
