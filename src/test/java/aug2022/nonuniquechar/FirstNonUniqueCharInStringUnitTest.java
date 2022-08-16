package aug2022.nonuniquechar;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 */
public class FirstNonUniqueCharInStringUnitTest {
    private FirstNonUniqueCharInString data;

    @BeforeEach
    void init() {
        this.data =  new FirstNonUniqueCharInString();
    }

    @Test
    void testWhenFirstNonRepetitiveCharInBegin() {
        assertThat(this.data.find("leetcode"))
                .isEqualTo(0);
    }

    @Test
    void testWhenFirstNonRepetitiveCharInMiddle() {
        assertThat(this.data.find("loveleetcode"))
                .isEqualTo(2);
    }

    @Test
    void testWhenFirstNonRepetitiveCHHarInBegin() {
        assertThat(this.data.find("aabb"))
                .isEqualTo(-1);
    }


}
