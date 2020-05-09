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
    void shouldReturnTrueIfRansomNoteCanFound() {
        assertThat(this.noteFinder.isConstructable("aa", "aba"))
                .isTrue();
    }

    @Test
    void shouldReturnFalseIfRansomNull() {
        assertThat(this.noteFinder.isConstructable(null, "aba"))
                .isFalse();
    }

    @Test
    void shouldReturnFalseIfMagazineNull() {
        assertThat(this.noteFinder.isConstructable("aa", null))
                .isFalse();
    }

    @Test
    void shouldReturnTrueIfNBothAreNull() {
        assertThat(this.noteFinder.isConstructable(null, null))
                .isTrue();
    }

    @Test
    void shouldReturnFalseIfRansomNoteCanNotFound() {
        assertThat(this.noteFinder.isConstructable("aaavb", "aa"))
                .isFalse();
    }
}
