package aug2022.reducearraysize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reduce-array-size-to-the-half/">...</a>
 *
 * Created by Deb
 */
public class ReduceArraySizeUnitTest {
    private ReduceArraySize reduce;

    @BeforeEach
    void init() {
        this.reduce = new ReduceArraySize();
    }

    @Test
    void testReduceSize1() {
        assertThat(this.reduce.reduce(new int[]{3,3,3,3,5,5,5,2,2,7}))
                .isEqualTo(2);
    }
}
