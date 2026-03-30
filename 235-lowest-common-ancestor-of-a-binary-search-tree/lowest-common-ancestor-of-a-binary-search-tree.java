/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Recursion
        /*
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        else if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);

        return root;
        */

        // Using Loop
        while (root != null) {
            if (p.val > root.val && q.val > root.val)
                root = root.right;
            
            else if (p.val < root.val && q.val < root.val)
                root = root.left;
            
            else 
                return root;
        }

        return null;
    }
}