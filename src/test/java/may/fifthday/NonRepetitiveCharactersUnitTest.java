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
    void shouldReturnIndexWhenCodesFindIt() {
        assertThat(this.nonRepetitiveCharacters.findNonRepetitiveCharIndex("leetcode"))
                .isEqualTo(0);
    }

    @Test
    void shouldReturnNegetiveValueIfEmptyStringReturn() {
        assertThat(this.nonRepetitiveCharacters.findNonRepetitiveCharIndex(""))
                .isEqualTo(-1);
    }

    @Test
    void shouldReturnNegetiveValueIfNulltringReturn() {
        assertThat(this.nonRepetitiveCharacters.findNonRepetitiveCharIndex(null))
                .isEqualTo(-1);
    }

    @Test
    void shouldReturnIndexWhenCodesFindIt1() {
        assertThat(this.nonRepetitiveCharacters.findNonRepetitiveCharIndex("loveleetcode"))
                .isEqualTo(2);
    }

    @Test
    void shouldReturnNegetiveValueWhenIndexNotFound() {
        assertThat(this.nonRepetitiveCharacters.findNonRepetitiveCharIndex("aaaaaaa"))
                .isEqualTo(-1);
    }





}
