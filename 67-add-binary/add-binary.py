class Solution:
    def addBinary(self, a: str, b: str) -> str:
        rvA = 0
        n = len(a)
        for i in range(n):
            bit = int(a[i])
            rvA += bit * (2 ** (n - 1 - i))
        rvB = 0
        m = len(b)
        for i in range(m):
            bit = int(b[i])
            rvB += bit * (2 ** (m - 1 - i))
        dec = rvA + rvB
        if dec == 0:
            return "0"
        finalBinaryValue = ""
        while (dec > 0):
            finalBinaryValue = str(dec % 2) + finalBinaryValue
            dec //= 2  
        return finalBinaryValue
