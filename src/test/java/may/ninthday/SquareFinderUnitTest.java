package may.ninthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 09/05/2020.
 */
public class SquareFinderUnitTest {
    private SquareFinder finder;

    @BeforeEach
    void init() {
        this.finder = new SquareFinder();
    }

    @Test
    void shouldReturnTrueWhenNumIs25() {
        assertThat(this.finder.find(25))
                .isTrue();

    }

    @Test
    void shouldReturnTrueWhenNumIs0() {
        assertThat(this.finder.find(0))
                .isTrue();

    }

    @Test
    void shouldReturnFalseWhenNumIsNegative() {
        assertThat(this.finder.find(-1))
                .isFalse();

    }

    @Test
    void shouldReturnFalseWhenNumIs14() {
        assertThat(this.finder.find(14))
                .isFalse();

    }

    @Test
    void shouldReturnFalseWhenNumIs1() {
        assertThat(this.finder.find(1))
                .isTrue();
    }

    @Test
    void shouldReturnFalseWhenNumIs4() {
        assertThat(this.finder.find(4))
                .isTrue();
    }
}
