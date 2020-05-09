package may.sixthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 06/05/2020.
 */
public class MajorityNumberFinder {
    private MajorityNumber finder;

    @BeforeEach
    void init() {
        this.finder = new MajorityNumber();
    }

    @Test
    void testFoundMajorityNumber1() {
        int[] nums = new int[]{3, 2, 3};
        assertThat(this.finder.find(nums))
                .isEqualTo(3);

    }

    @Test
    void testFoundMajorityNumber2() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertThat(this.finder.find(nums))
                .isEqualTo(2);

    }

}
