package leetcode.practice.slidingwindow.category.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DefuseTheBombTest {

    @Test
    public void test1() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] decrypt = defuseTheBomb.decrypt(new int[]{5, 7, 1, 4}, 3);
        assertArrayEquals(new int[]{12,10,16,13}, decrypt);
    }

    @Test
    public void test2() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] decrypt = defuseTheBomb.decrypt(new int[]{1,2,3,4}, 0);
        assertArrayEquals(new int[]{0,0,0,0}, decrypt);
    }

    @Test
    public void test3() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        int[] decrypt = defuseTheBomb.decrypt(new int[]{2,4,9,3}, -2);
        assertArrayEquals(new int[]{12,5,6,13}, decrypt);
    }
}
