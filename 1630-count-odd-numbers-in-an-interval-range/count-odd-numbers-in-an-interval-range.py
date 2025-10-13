class Solution:
    def countOdds(self, low: int, high: int) -> int:
        if (high - low + 1) % 2 == 1 and (high % 2 == 1 and low % 2 == 1):
            return math.ceil((high - low + 1) / 2)
        elif (high - low + 1) % 2 == 1 and (high % 2 != 1 and low % 2 != 1):
            return (high - low + 1) // 2
        elif (high - low + 1) % 2 == 0 and ((high % 2 == 1 and low % 2 == 0) or (high % 2 == 0 and low % 2 == 1)):
            return math.ceil((high - low + 1) / 2)
            
        