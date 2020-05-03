package may.thirdday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 03/05/2020.
 */
public class RansomNoteFinderUnitTest {
    private RansomNoteFinder noteFinder;

    @BeforeEach
    void init() {
        this.noteFinder = new RansomNoteFinder();
    }

    @Test
    void should_return_true_if_ransom_note_can_found() {
        assertThat(this.noteFinder.construct("aa", "aba"))
                .isTrue();
    }

    @Test
    void should_return_false_if_ransom_null() {
        assertThat(this.noteFinder.construct(null, "aba"))
                .isFalse();
    }

    @Test
    void should_return_false_if_magazine_null() {
        assertThat(this.noteFinder.construct("aa", null))
                .isFalse();
    }

    @Test
    void should_return_true_if_both_are_null() {
        assertThat(this.noteFinder.construct(null, null))
                .isTrue();
    }

    @Test
    void should_return_false_if_ransom_note_can_not_found() {
        assertThat(this.noteFinder.construct("aaavb", "aa"))
                .isFalse();
    }
}
