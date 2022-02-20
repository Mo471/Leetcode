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
    // This method returns original given root of the tree, which has key removed and tree normalised to remain BST
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val < key) { // traversal
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) { // traversal
            root.left = deleteNode(root.left, key);
        } else { // root node to delete, contains key
            if (root.left == null && root.right == null) { // both children missing
                return null;
            } else if (root.left == null && root.right != null) { // left child only missing
                return root.right;
            } else if (root.right == null && root.left != null) { // right child only missing
                return root.left;
            } else { // both children exist, decision was made to use right subtree
                    // finding minimum element of the right subtree
                    TreeNode minElement = root.right;
                    while (minElement.left != null) {
                        minElement = minElement.left;
                    }
                    root.val = minElement.val;
                    root.right = deleteNode(root.right, root.val);
                }
            }
        return root;
    }
}