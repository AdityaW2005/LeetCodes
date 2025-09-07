class Solution:
    def getNext(self, n: int) -> int:
        """
        Calculates the sum of the squares of the digits of a number.
        """
        total_sum = 0
        while n > 0:
            n, digit = divmod(n, 10)
            total_sum += digit ** 2
        return total_sum

    def isHappy(self, n: int) -> bool:
        """
        Determines if a number is a "happy number" using Floyd's Cycle-Finding Algorithm.
        This approach uses O(1) space.

        Args:
            n: A positive integer.

        Returns:
            True if n is a happy number, and False if not.
        """
        slow = n
        fast = n

        while True:
            slow = self.getNext(slow)
            fast = self.getNext(self.getNext(fast))

            if fast == 1:
                return True
            
            if slow == fast:
                return False
