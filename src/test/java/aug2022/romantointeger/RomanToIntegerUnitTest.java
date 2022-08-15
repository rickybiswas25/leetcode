package aug2022.romantointeger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToIntegerUnitTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    public void init() {
        this.romanToInteger = new RomanToInteger();
    }

    @Test
    public void testSmallerNumber() {
        assertThat(this.romanToInteger.convert("III"))
                .isEqualTo(3);
    }

    @Test
    public void testBiggerNumber() {
        assertThat(this.romanToInteger.convert("MCMXCIV"))
                .isEqualTo(1994);
    }

    @Test
    public void testBiggerNumberWithDifferentCombination() {
        assertThat(this.romanToInteger.convert("LVIII"))
                .isEqualTo(58);
    }


}
