package leetcode.practice.assessment;

/*

Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.


Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Example 2:
Input: root = [1]
Output: 0

Constraints:
The number of nodes in the tree is in the range [1, 1000].
-1000 <= Node.val <= 1000
 */

import leetcode.practice.utils.TreeNode;

import java.util.Stack;

public class TreeSumOfLeftLeaves {

    public static int sumOfLeftLeavesRecursive(TreeNode root) {
        if (root == null) return 0;
        int leftSum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            leftSum += root.left.val;

        return leftSum + sumOfLeftLeavesRecursive(root.left) + sumOfLeftLeavesRecursive(root.right);
    }

    public static int sumOfLeftLeavesIterative(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int leftSum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
            if (node.left != null && node.left.left == null && node.left.right == null) leftSum += node.left.val;
        }
        return leftSum;
    }
}
