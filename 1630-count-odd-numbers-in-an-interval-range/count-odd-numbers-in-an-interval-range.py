class Solution:
    def countOdds(self, low: int, high: int) -> int:
        range = high - low + 1
        if range % 2 == 1 and (high % 2 == 1 and low % 2 == 1):
            return math.ceil(range / 2)
        elif range % 2 == 1 and (high % 2 != 1 and low % 2 != 1):
            return range // 2
        elif range % 2 == 0 and ((high % 2 == 1 and low % 2 == 0) or (high % 2 == 0 and low % 2 == 1)):
            return math.ceil(range / 2)