class Solution:
    def addDigits(self, num: int) -> int:
        def sumOfDigits(num):
            temp = num
            currentSum = 0
            if temp < 10:
                return temp
            while (temp > 0):
                digit = temp % 10
                currentSum += digit
                temp //= 10
            return currentSum
        currentNum = num
        while (currentNum >= 10):
            currentNum = sumOfDigits(currentNum)
        return currentNum