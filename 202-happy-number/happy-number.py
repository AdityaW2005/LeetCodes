class Solution:
    def isHappy(self, n: int) -> bool:
        """
        Determines if a number is a "happy number" using Floyd's Cycle-Finding Algorithm.
        All logic is inlined within this single function.

        Args:
            n: A positive integer.

        Returns:
            True if n is a happy number, and False if not.
        """
        slow = n
        fast = n

        # A do-while loop is simulated since the first iteration must always run.
        while True:
            # Advance slow pointer by one step
            s_slow = 0
            temp_slow = slow
            while temp_slow > 0:
                temp_slow, digit = divmod(temp_slow, 10)
                s_slow += digit * digit
            slow = s_slow

            # Advance fast pointer by two steps
            for _ in range(2):
                s_fast = 0
                temp_fast = fast
                while temp_fast > 0:
                    temp_fast, digit = divmod(temp_fast, 10)
                    s_fast += digit * digit
                fast = s_fast
            
            # If pointers meet, a cycle is found. Break the loop.
            if slow == fast:
                break
        
        # If the cycle is at 1, the number is happy.
        return slow == 1
