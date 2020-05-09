package may.eightday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 08/05/2020.
 */
public class CoordinateEvaluatorUnitTest {
    private CoordinateEvaluator evaluator;

    @BeforeEach
    void init() {
        this.evaluator = new CoordinateEvaluator();
    }

    @Test
    void ctestCoordinateEvaluatorTest() {
        int[][] cordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        assertThat(this.evaluator.evaluate(cordinates))
                .isFalse();

    }

    @Test
    void ctestCoordinateEvaluatorTest1() {
        int[][] cordinates = new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        assertThat(this.evaluator.evaluate(cordinates))
                .isTrue();

    }

    @Test
    void ctestCoordinateEvaluatorTest2() {
        int[][] cordinates = new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        assertThat(this.evaluator.evaluate(cordinates))
                .isFalse();

    }

    @Test
    void ctestCoordinateEvaluatorTest3() {
        int[][] cordinates = new int[][]{{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}};
        assertThat(this.evaluator.evaluate(cordinates))
                .isTrue();

    }

    @Test
    void ctestCoordinateEvaluatorTest4() {
        int[][] cordinates = new int[][]{{4,8},{-2,8},{1,8},{8,8},{-5,8},{0,8},{7,8},{5,8}};
        assertThat(this.evaluator.evaluate(cordinates))
                .isTrue();

    }
}
