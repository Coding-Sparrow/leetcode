package leetcode.practice.slidingwindow.category.easy;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIITest {

    @Test
    public void test1() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        boolean contains = containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        Assert.assertEquals(true, contains);
    }

    @Test
    public void test2() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        boolean contains = containsDuplicateII.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);
        Assert.assertEquals(true, contains);
    }

    @Test
    public void test3() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        boolean contains = containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2);
        Assert.assertEquals(false, contains);
    }

}
