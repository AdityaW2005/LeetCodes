class Solution:
    def convertDateToBinary(self, date: str) -> str:
        # year = int(date[:4])
        # month = int(date[5:7])
        # day = int(date[8:])
        # return bin(year)[2:] + '-' + bin(month)[2:] + '-' + bin(day)[2:]

        l = date.split("-")
        s = ""
        for i in l:
            s = s + str(bin(int(i))[2:]) + '-'
        s = s.rstrip(s[-1])
        return s