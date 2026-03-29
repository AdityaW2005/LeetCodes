class Solution:
    def findComplement(self, num: int) -> int:
        binValue = bin(num)[2:]
        l = list(binValue)

        for i in range(len(l)):
            if l[i] == '0':
                l[i] = '1'
            else:
                l[i] = '0'
        
        compValue = ''.join(l)
        intValue = int(compValue, 2)

        return intValue