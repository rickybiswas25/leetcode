package may.fourteenthday;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 14/05/2020.
 */
public class TrieUnitTest {

    @Test
    void testWholeWordSearch() {
        Trie obj = new Trie();
        obj.insert("apple");
        assertThat(obj.search("apple"))
                .isEqualTo(true);

    }

    @Test
    void testStartsWithSearch() {
        Trie obj = new Trie();
        obj.insert("apple");
        assertThat(obj.startsWith("app"))
                .isEqualTo(true);

    }
}
