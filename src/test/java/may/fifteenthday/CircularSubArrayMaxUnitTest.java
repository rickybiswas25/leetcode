package may.fifteenthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 15/05/2020.
 */
public class CircularSubArrayMaxUnitTest {

    private CircularSubArrayMax robot;

    @BeforeEach
    void init() {
        this.robot = new CircularSubArrayMax();
    }

    @Test
    void testCase1() {
        int[] a = new int[]{1, -2, 3, -2};
        assertThat(this.robot.maxSubarraySumCircular(a))
                .isEqualTo(3);
    }

    @Test
    void testCase2() {
        int[] a = new int[]{5, -3, 5};
        assertThat(this.robot.maxSubarraySumCircular(a))
                .isEqualTo(10);
    }

    @Test
    void testCase3() {
        int[] a = new int[]{3, -1, 2, -1};
        assertThat(this.robot.maxSubarraySumCircular(a))
                .isEqualTo(4);
    }

    @Test
    void testCase4() {
        int[] a = new int[]{3, -2, 2, -3};
        assertThat(this.robot.maxSubarraySumCircular(a))
                .isEqualTo(3);
    }

}
