class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        l = list(int(i) for i in str(x))
        if x % sum(l) == 0:
            return sum(l)
        else:
            return -1 