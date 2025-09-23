class Solution:
    def reverseBits(self, n: int) -> int:
        bitValue = format(n, '032b')
        return int(bitValue[::-1], 2)