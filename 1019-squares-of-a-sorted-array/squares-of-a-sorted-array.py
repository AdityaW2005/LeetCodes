class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        squared_array = []
        
        for i in nums:
            squared_array.append(i * i)
        squared_array.sort()

        return squared_array