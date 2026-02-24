# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head

        groupPrev = dummy

        while True:
            kth = self.getKthNode(groupPrev, k)
            if kth == None:
                break
            
            groupNext = kth.next

            prev, curr = groupNext, groupPrev.next

            for i in range(k):
                temp = curr.next
                curr.next = prev
                prev = curr
                curr = temp
            
            temp = groupPrev.next
            groupPrev.next = kth
            groupPrev = temp
        
        return dummy.next

    def getKthNode(self, curr: Optional[ListNode], k: int) -> Optional[ListNode]:
        while (curr != None and k > 0):
            curr = curr.next
            k -= 1
        
        return curr