package may.secondday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 02/05/2020.
 */
public class FindJewelTest {
    private FindJewel jewel;

    @BeforeEach
    void init() {
        this.jewel = new FindJewel();
    }

    @Test
    void should_return_0_when_jewel_is_null() {
        assertThat(this.jewel.find(null, "aaZZZZ"))
                .isEqualTo(0);
    }

    @Test
    void should_return_0_when_stone_is_null() {
        assertThat(this.jewel.find("aa", null))
                .isEqualTo(0);
    }

    @Test
    void test_for_proper_calculation_1() {
        assertThat(this.jewel.find("aA", "aAAbbbb"))
                .isEqualTo(3);
    }

    @Test
    void test_for_proper_calculation_2() {
        assertThat(this.jewel.find("z", "ZZ"))
                .isEqualTo(0);
    }
}
