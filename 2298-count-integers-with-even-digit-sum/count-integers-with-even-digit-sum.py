class Solution:
    def countEven(self, num: int) -> int:
        def digitSum(x):
            sumOfDigit = 0
            while x > 0:
                sumOfDigit += x % 10
                x //= 10
            return sumOfDigit
        
        count = 0
        for i in range(1, num + 1):
            if digitSum(i) % 2 == 0:
                count += 1
        return count