package may.seventeenthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 17/05/2020.
 */
public class IndexAnagramFinderUnitTest {

    private IndexAnagramFinder finder;

    @BeforeEach
    void init() {
        this.finder = new IndexAnagramFinder();
    }


    @Test
    void testWhenStringIsEmpty() {
        assertThat(this.finder.findAnagrams("", "abc"))
                .isEmpty();

    }

    @Test
    void testWhenStringHaveProperValue() {
        assertThat(this.finder.findAnagrams("cbaebabacd", "abc"))
                .hasSize(2)
                .contains(0, 6);

    }

    @Test
    void testWhenStringHaveProperValue2() {
        assertThat(this.finder.findAnagrams("abab", "ab"))
                .hasSize(3)
                .contains(0, 1, 2);

    }

    @Test
    void testWhenStringHaveProperValue3() {
        assertThat(this.finder.findAnagrams("baa", "aa"))
                .hasSize(1)
                .contains(1);
    }

    @Test
    void testWhenStringHaveProperValue4() {
        assertThat(this.finder.findAnagrams("acdcaeccde", "c"))
                .hasSize(4)
                .contains(1, 3, 6, 7);
    }

    @Test
    void testWhenStringHaveProperValue5() {
        assertThat(this.finder.findAnagrams("ababababab", "aab"))
                .hasSize(4)
                .contains(0, 2, 4, 6);
    }




    @Test
    void testWhenAnagramIsNotFound() {
        assertThat(this.finder.findAnagrams("gfhghj", "abc"))
                .isEmpty();
    }

}
