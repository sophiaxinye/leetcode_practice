/* 
Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

//Runtime: 348 ms

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        
        if (root == null) {
            return depth;
        } else {
            depth = depth + 1;
            if (root.left != null & root.right != null){
                int depthLeft = maxDepth(root.left);
                int depthRight = maxDepth (root.right);
                
                if ( depthLeft > depthRight){
                    depth = depth + depthLeft;
                } else {
                    depth = depth + depthRight;
                }
            } else if (root.left != null & root.right == null) {
                depth = depth + maxDepth (root.left);
            } else if (root.left == null & root.right != null){
                depth = depth + maxDepth (root.right);
            } 
        }
        
        return depth;
    }
}
