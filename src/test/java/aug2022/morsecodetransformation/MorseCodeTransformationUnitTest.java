package aug2022.morsecodetransformation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/unique-morse-code-words/">...</a>
 *
 * Created by Deb
 */
public class MorseCodeTransformationUnitTest {
    private MorseCodeTransformation data;

    @BeforeEach
    void init() {
        this.data = new MorseCodeTransformation();
    }

    @Test
    void testMorseCodeTransformation1() {
        assertThat(this.data.findNumberOfUniqueMorseCodeWord(new String[]{"gin","zen","gig","msg"}))
                .isEqualTo(2);
    }

    @Test
    void testMorseCodeTransformation2() {
        assertThat(this.data.findNumberOfUniqueMorseCodeWord(new String[]{"a"}))
                .isEqualTo(1);
    }


}
