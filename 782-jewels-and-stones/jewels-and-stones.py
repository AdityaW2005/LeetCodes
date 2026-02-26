class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewel_count = 0
        jewel_set = set(jewels)

        for i in stones:
            if i in jewel_set:
                jewel_count += 1
            
        return jewel_count