/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return validate(root, ((double)Integer.MIN_VALUE) - 1, ((double)Integer.MAX_VALUE) + 1);
        
    }
    
    // doubles need to be used here in order to avoid edge case when root is max or min value of int
    public boolean validate(TreeNode root, double leftBorder, double rightBorder) {
        
        if (root.left != null) {
            if (root.left.val >= root.val || root.left.val <= leftBorder) {
                return false;
            }
            if (validate(root.left, leftBorder, (double)root.val) == false) {
                return false;
            }
        }
        
        if (root.right != null) {
            if (root.right.val <= root.val || root.right.val >= rightBorder) {
                return false;
            }
            if (validate(root.right, (double)root.val, rightBorder) == false) {
                return false;
            }
            
        }
        
        return true;
    }
}