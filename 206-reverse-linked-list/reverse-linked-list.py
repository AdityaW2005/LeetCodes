# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Recursive Approach
        """
        if (head == None or head.next == None):
            return head

        newHead = self.reverseList(head.next)

        head.next.next = head
        head.next = None

        return newHead
        """

        # Optimal Approach
        prev, temp = None, head

        while (temp != None):
            front = temp.next
            temp.next = prev
            prev = temp
            temp = front

        return prev