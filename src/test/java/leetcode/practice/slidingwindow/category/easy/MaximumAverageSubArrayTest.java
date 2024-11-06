package leetcode.practice.slidingwindow.category.easy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubArrayTest {

    @Test
    public void test1() {
        MaximumAverageSubArray maximumAverageSubArray = new MaximumAverageSubArray();
        double maxAverage = maximumAverageSubArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        Assert.assertEquals(12.75, maxAverage, .00001);
    }

    @Test
    public void test2() {
        MaximumAverageSubArray maximumAverageSubArray = new MaximumAverageSubArray();
        double maxAverage = maximumAverageSubArray.findMaxAverage(new int[]{5}, 1);
        Assert.assertEquals(5.0, maxAverage, .00001);
    }

    @Test
    public void test3() {
        MaximumAverageSubArray maximumAverageSubArray = new MaximumAverageSubArray();
        double maxAverage = maximumAverageSubArray.findMaxAverage(new int[]{-1}, 1);
        Assert.assertEquals(-1.0, maxAverage, .00001);
    }

}