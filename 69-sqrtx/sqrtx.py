class Solution:
    def mySqrt(self, x: int) -> int:
        # Handle small x directly
        if x < 2:
            return x

        left, right = 1, x // 2  # sqrt(x) <= x//2 for x >= 2
        ans = 1  # will track floor sqrt

        while left <= right:
            mid = (left + right) // 2

            # Compare mid * mid with x without overflow
            if mid <= x // mid:
                ans = mid           # mid^2 <= x, mid is a candidate
                left = mid + 1      # try larger
            else:
                right = mid - 1     # mid^2 > x, try smaller

        return ans
