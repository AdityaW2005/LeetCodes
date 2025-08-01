# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        temp = ListNode()
        head = temp
        while list1 and list2:
            if list1.val <= list2.val:
                if head == None:
                    head = list1
                else:
                    head.next = list1
                    list1 = list1.next
            else:
                if head == None:
                    head = list2
                else:
                    head.next = list2
                    list2 = list2.next
            head = head.next
        if list1:
            head.next = list1
            list1 = list1.next
        if list2:
            head.next = list2
            list2 = list2.next
        return temp.next
        