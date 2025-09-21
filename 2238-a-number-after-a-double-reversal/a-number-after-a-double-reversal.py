class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        reversed1 = int(str(num)[::-1])
        if num == int(str(reversed1)[::-1]):
            return True
        else:
            return False