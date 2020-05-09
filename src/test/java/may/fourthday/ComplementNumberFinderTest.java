package may.fourthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Deb
 * Date : 04/05/2020.
 */
class ComplementNumberFinderTest {
    private ComplementNumberFinder finder;

    @BeforeEach
    void init() {
        this.finder = new ComplementNumberFinder();
    }

    @Test
    void testFindComplement() {
        assertThat(this.finder.findComplement(5))
                .isEqualTo(2);

    }
}
