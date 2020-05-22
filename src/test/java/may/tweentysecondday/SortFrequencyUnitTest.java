package may.tweentysecondday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortFrequencyUnitTest {
    private StringSortByFrequency method;

    @BeforeEach
    void init() {
        this.method = new StringSortByFrequency();
    }

    @Test
    void sort() {
        String input = "raaeaedere";
        assertThat(this.method.sort(input))
                .startsWith("eeeeaaa")
                .contains("aaa")
                .contains("d")
                .contains("r");

    }
}
