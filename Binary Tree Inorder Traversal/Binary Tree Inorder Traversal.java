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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        
        
        traverse(result, root);
        return result;
    }
    
    public static void traverse (List<Integer> traversalValues, TreeNode root) {       
        
        if (root.left != null) {
            traverse(traversalValues, root.left);
        }
        
        traversalValues.add(root.val);
        
        if (root.right != null) {
            traverse(traversalValues, root.right);
        }
        
        
    }
}