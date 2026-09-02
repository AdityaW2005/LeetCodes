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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) 
            return 0;
        
        int maxWidth = 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();

        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size(); // For current level
            int minIndex = queue.peek().getValue(); // For min index
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                int currIndex = pair.getValue() - minIndex;

                if (i == 0)
                    first = currIndex;
                if (i == size - 1)
                    last = currIndex;
                
                if (node.left != null)
                    queue.add(new Pair<>(node.left, 2 * currIndex + 1));
                if (node.right != null)
                    queue.add(new Pair<>(node.right, 2 * currIndex + 2));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}