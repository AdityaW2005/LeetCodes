class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()     # Dummy head of the result list
        current = dummy        # Pointer to build result list
        carry = 0              # Initialize carry

        # Loop until both lists are done and there's no carry
        while l1 or l2 or carry:
            # Extract values or use 0 if a list is exhausted
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            total = val1 + val2 + carry
            carry = total // 10
            digit = total % 10

            # Create new node for the digit
            current.next = ListNode(digit)
            current = current.next

            # Move to the next nodes in input lists
            if l1: l1 = l1.next
            if l2: l2 = l2.next

        return dummy.next
