# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None or head.next is None:
            return True
        
        fast, slow = head, head
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
        
        if fast is not None:
            slow = slow.next

        newHead = self.reverseLL(slow)

        first, second = head, newHead
        while second is not None:
            if first.val != second.val:
                self.reverseLL(newHead)
                return False

            first = first.next
            second = second.next

        self.reverseLL(newHead)
        return True

    def reverseLL(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        newHead = self.reverseLL(head.next)
        front = head.next
        front.next = head
        head.next = None

        return newHead
