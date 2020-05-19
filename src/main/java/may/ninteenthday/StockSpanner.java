package may.ninteenthday;

import java.util.Stack;

/**
 * Created by Deb
 * Date : 19/05/2020.
 *
 * Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.
 *
 * The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.
 *
 * For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6]
 */
public class StockSpanner {

    private final Stack<int[]> spanCollector;

    public StockSpanner() {
        spanCollector = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!spanCollector.isEmpty() && price >= spanCollector.peek()[0]) {
            span += spanCollector.pop()[1];
        }
        spanCollector.push(new int[]{price, span});
        return span;
    }
}
