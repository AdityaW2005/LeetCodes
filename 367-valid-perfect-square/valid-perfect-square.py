class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        # Using Binary Search

        # low = 1
        # right = num

        # while low <= right:
        #     mid = (low+right)//2
        #     res = mid * mid
        #     if res == num:
        #         return True
        #     elif res < num:
        #         low = mid+1
        #     else:
        #         right = mid-1
        # return False

        a, b = math.modf(num ** 0.5)
        return a == 0