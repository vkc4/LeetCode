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
    public void recoverTree(TreeNode root) {
           TreeNode[] incorrectNodes = new TreeNode[3];
        correctBST(root, incorrectNodes);

        if (incorrectNodes[0] != null && incorrectNodes[1] != null) {
            int temp = incorrectNodes[0].val;
            incorrectNodes[0].val = incorrectNodes[1].val;
            incorrectNodes[1].val = temp;
        }

       
    }   

    private static void correctBST(TreeNode root, TreeNode[] incorrectNodes) {
        if (root == null) {
            return;
        }

        correctBST(root.left, incorrectNodes);

        if (incorrectNodes[2] != null && root.val < incorrectNodes[2].val) {
            if (incorrectNodes[0] == null) {
                incorrectNodes[0] = incorrectNodes[2];
                incorrectNodes[1] = root;
            } else {
                incorrectNodes[1] = root;
            }
        }

        incorrectNodes[2] = root;

        correctBST(root.right, incorrectNodes);
    }
}