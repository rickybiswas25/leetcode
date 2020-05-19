package may.ninteenthday;

import may.ninteenthday.StockSpanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 19/05/2020.
 */
public class StockSpannerUnitTest {
    private StockSpanner spanner;

    @BeforeEach
    void init() {
        this.spanner = new StockSpanner();
    }

    @Test
    void test() {
        assertThat(spanner.next(70))
                .isEqualTo(1);

        assertThat(spanner.next(80))
                .isEqualTo(2);

        assertThat(spanner.next(60))
                .isEqualTo(1);

        assertThat(spanner.next(100))
                .isEqualTo(4);
    }

}
