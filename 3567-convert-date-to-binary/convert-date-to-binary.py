class Solution:
    def convertDateToBinary(self, date: str) -> str:
        l = date.split("-")
        s = ""
        for i in l:
            s = s + str(bin(int(i))[2:]) + '-'
        s = s.rstrip(s[-1])
        return s