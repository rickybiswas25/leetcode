package may.eleventhday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 11/05/2020.
 */
public class FloodFillUnitTest {
    private FloodFill color;

    @BeforeEach
    void init() {
        this.color = new FloodFill();
    }

    @Test
    void testCase1() {
        int[][] pixels = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] answer = {{2,2,2},{2,2,0},{2,0,1}};
        List<Integer> expected = arrayToList(answer);
        List<Integer> answers = arrayToList(this.color.floodFill(pixels, 1, 1, 2));
        assertThat(answers)
                .isEqualTo(expected);
    }

    private List<Integer> arrayToList(int[][] pixels) {
        List<Integer> numbers = new ArrayList();
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                numbers.add(pixels[i][j]);
            }
        }
        return numbers;
    }

    @Test
    void testCase2() {
        int[][] pixels = {{0,0,0},{0,1,1}};
        List<Integer> expected = arrayToList(pixels);
        List<Integer> answers = arrayToList(this.color.floodFill(pixels, 1, 1, 1));
        assertThat(answers)
                .isEqualTo(expected);
    }
}
