package leetcode.practice.assessment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTest {

    @Test
    public void test() {
        int minCostClimbingStairs = MinCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20});
        assertEquals(15, minCostClimbingStairs);
    }

    @Test
    public void test2() {
        int minCostClimbingStairs = MinCostClimbingStairs.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
        assertEquals(6, minCostClimbingStairs);
    }
}
