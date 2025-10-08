class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        selfDivNums = []
        for i in range(left, right + 1):
            n = i
            ok = True
            while n > 0:
                digit = n % 10
                if digit == 0 or i % digit != 0:
                    ok = False
                    break
                n //= 10
            if ok:
                selfDivNums.append(i)
                
        return selfDivNums
