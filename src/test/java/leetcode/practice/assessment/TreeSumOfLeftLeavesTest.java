package leetcode.practice.assessment;

import leetcode.practice.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeSumOfLeftLeavesTest {

    @Test
    public void testRecursive() {
        TreeNode root = TreeNode.getTree1();
        int sumOfLeftLeavesRecursive = TreeSumOfLeftLeaves.sumOfLeftLeavesRecursive(root);
        assertEquals(24, sumOfLeftLeavesRecursive);
    }

    @Test
    public void testIterative() {
        TreeNode root = TreeNode.getTree1();
        int sumOfLeftLeavesRecursive = TreeSumOfLeftLeaves.sumOfLeftLeavesIterative(root);
        assertEquals(24, sumOfLeftLeavesRecursive);
    }
}
