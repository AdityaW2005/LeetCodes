# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        self.rightView(root, result, 0)
        return result

    def rightView(self, root: Optional[TreeNode], result: List[int], level: int):
        if not root:
            return
        
        if len(result) == level:
            result.append(root.val)
        
        self.rightView(root.right, result, level + 1)
        self.rightView(root.left, result, level + 1)