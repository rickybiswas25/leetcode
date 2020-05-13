package may.thirteenthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 13/05/2020.
 */
public class SmallestNumberFinderUnitTest {
    private SmallestNumberFinder finder;

    @BeforeEach
    void init() {
        this.finder = new SmallestNumberFinder();
    }

    @Test
    void testNormalCase() {
        assertThat(this.finder.find("1432219", 3))
                .isEqualTo("1219");
    }

    @Test
    void testWithLeadingZero() {
        assertThat(this.finder.find("10200", 1))
                .isEqualTo("200");
    }

    @Test
    void testWithOnlyOneNumber() {
        assertThat(this.finder.find("0", 0))
                .isEqualTo("0");
    }





}
