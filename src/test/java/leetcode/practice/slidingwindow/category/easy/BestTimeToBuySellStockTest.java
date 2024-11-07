package leetcode.practice.slidingwindow.category.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuySellStockTest {

    @Test
    public void test() {
        BestTimeToBuySellStock bestTimeToBuySellStock = new BestTimeToBuySellStock();
        int maxProfit = bestTimeToBuySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(5, maxProfit);
    }

    @Test
    public void test2() {
        BestTimeToBuySellStock bestTimeToBuySellStock = new BestTimeToBuySellStock();
        int maxProfit = bestTimeToBuySellStock.maxProfit(new int[]{7,6,4,3,1});
        Assert.assertEquals(0, maxProfit);
    }
}
