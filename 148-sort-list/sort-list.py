# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Brute Force Approach
        
        arr = []
        temp = head

        while (temp is not None):
            arr.append(temp.val)
            temp = temp.next

        arr.sort()
        temp = head

        for i in range(0, len(arr)):
            temp.val = arr[i]
            temp = temp.next
        
        return head