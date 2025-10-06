class Solution:
    def splitNum(self, num: int) -> int:
        l = []
        for i in str(num):
            l.append(i)
        l.sort()

        minValue1 = ""
        minValue2 = ""

        for i in range(0, len(l), 2):
            minValue1 = minValue1 + l[i]
        for j in range(1, len(l), 2):
            minValue2 = minValue2 + l[j]
            
        return int(minValue1) + int(minValue2)