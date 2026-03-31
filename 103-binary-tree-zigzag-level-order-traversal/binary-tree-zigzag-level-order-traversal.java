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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int size = queue.size();

            Deque<Integer> level = new ArrayDeque();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (reverse)
                    level.addFirst(node.val);
                else
                    level.addLast(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            res.add(new ArrayList<>(level));
            reverse = !reverse;
        }
        return res;
    }
}