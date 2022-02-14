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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        return traverse(root, k, set);
    }
    
    public boolean traverse(TreeNode root, int k, Set<Integer> set) {
        
        if (root.left != null) {
            if (traverse(root.left, k, set)) {
                return true;
            }
        }
        int increment = k - root.val;
        if (set.contains(increment)) {
                return true;
            }
            set.add(root.val);
        if (root.right != null) {
            if (traverse(root.right, k, set)){
                return true;
            }
        }
        return false;
    }
}