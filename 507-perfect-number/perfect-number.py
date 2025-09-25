class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1:
            return False
        sumOfDivisors = 1
        i = 2
        while i * i <= num:
            if num % i == 0:
                sumOfDivisors += i
                if i != num // i:
                    sumOfDivisors += num // i
            i += 1
        return sumOfDivisors == num
