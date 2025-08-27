class Solution:
    def romanToInt(self, s: str) -> int:
        romanSymbols = {'I':1, 'V':5, 'X':10, 'L':50,  'C':100, 'D':500, 'M':1000}
        total = 0
        prev_value = 0

        for char in reversed(s):
            value = romanSymbols[char]
            if value >= prev_value:
                total += value
            else:
                total -= value
            prev_value = value
        return total    
