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
    private static int i;
    private static int p;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        i = inorder.length - 1;
        p = postorder.length - 1;
        return build(postorder, inorder, Integer.MIN_VALUE);
    }

    private static TreeNode build(int[] postorder, int[] inorder, int stop) {
        if (p < 0) {
            return null;
        }
        if (inorder[i] == stop) {
            --i;
            return null;
        }
        TreeNode node = new TreeNode(postorder[p--]);
        node.right = build(postorder, inorder, node.val);
        node.left = build(postorder, inorder, stop);
        return node;
    }
}

    
