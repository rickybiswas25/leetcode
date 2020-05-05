package may.fifthday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 05/05/2020.
 */
public class NonRepetitiveCharactersUnitTest {
    private  NonRepetitiveCharacters nonRepetitiveCharacters;

    @BeforeEach
    void init() {
        this.nonRepetitiveCharacters = new NonRepetitiveCharacters();
    }

    @Test
    void should_return_index_when_codes_find_it_1() {
        assertThat(this.nonRepetitiveCharacters.indexFinder("leetcode"))
                .isEqualTo(0);
    }

    @Test
    void test_for_empty_string() {
        assertThat(this.nonRepetitiveCharacters.indexFinder(""))
                .isEqualTo(-1);
    }

    @Test
    void test_for_null_string() {
        assertThat(this.nonRepetitiveCharacters.indexFinder(null))
                .isEqualTo(-1);
    }

    @Test
    void should_return_index_when_codes_find_it_2() {
        assertThat(this.nonRepetitiveCharacters.indexFinder("loveleetcode"))
                .isEqualTo(2);
    }

    @Test
    void should_return_negative_when_codes_dont_find_any_non_repetitive() {
        assertThat(this.nonRepetitiveCharacters.indexFinder("aaaaaaa"))
                .isEqualTo(-1);
    }





}
