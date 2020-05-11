package may.eleventhday;

/**
 * Created by Deb
 * Date : 11/05/2020.
 *
 *  An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 *
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
 *
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
 *
 * At the end, return the modified image.
 */
public class FloodFill {
    private int row;
    private int column;
    private int counter;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.row = image.length;
        this.column = image[0].length;
        int prevC = image[sr][sc];
        floodFill(image, sr, sc, prevC, newColor);
        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int prevC, int newColor) {
        counter++;
        if (row * column * 4 < counter) {
            return;
        }
        if (sr < 0 || sr >= this.row || sc < 0 || sc >= this.column) {
            return;
        }

        if (image[sr][sc] != prevC) {
            return;
        }

        image[sr][sc] = newColor;
        floodFill(image, sr + 1, sc, prevC, newColor);
        floodFill(image, sr - 1, sc, prevC, newColor);
        floodFill(image, sr, sc + 1, prevC, newColor);
        floodFill(image, sr, sc - 1, prevC, newColor);
    }
}
