class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        a, b = math.modf(num ** 0.5)
        return a == 0