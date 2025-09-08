class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        """
        Finds two integers, A and B, that do not contain the digit '0' and sum up to n.

        Args:
            n: The target integer.

        Returns:
            A list containing two No-Zero integers [A, B].
        """
        # A "No-Zero" integer is a positive integer that does not contain the digit 0.
        def has_zero(num: int) -> bool:
            # A simple way to check for a '0' is to convert the number to a string
            # and see if the character '0' is present.
            return '0' in str(num)

        # We can iterate from 1 up to n/2 + 1.
        # This is a small optimization because if [A, B] is a solution, then B > n/2 if A < n/2.
        # We check A starting from 1.
        for a in range(1, n):
            b = n - a

            # If both numbers do not contain a zero, we have found our pair.
            if not has_zero(a) and not has_zero(b):
                return [a, b]
