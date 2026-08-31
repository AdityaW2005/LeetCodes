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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode prev = null; // Checks for right subtree

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }

            else {
                if (stack.isEmpty())
                    break;
                
                TreeNode peekNode = stack.peek();

                if (peekNode.right != null && prev != peekNode.right)
                    node = peekNode.right;
                
                else {
                    postorder.add(peekNode.val);
                    prev = stack.pop();
                }
            }
        }

        return postorder;
    }
}