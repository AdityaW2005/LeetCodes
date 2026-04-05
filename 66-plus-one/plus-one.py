class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        d = ""
        for i in digits:
            d += str(i)
        intD = int(d) + 1
        
        strD = str(intD)
        intDigit = []
        for i in strD:
            intDigit.append(int(i))
        return intDigit