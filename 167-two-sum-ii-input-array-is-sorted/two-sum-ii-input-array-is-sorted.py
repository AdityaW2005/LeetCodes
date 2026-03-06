class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        hashMap = {}

        for i in range(len(numbers)):
            hashMap[numbers[i]] = i
        
        for i in range(len(numbers)):
            y = target - numbers[i]

            if y in numbers and hashMap[y] != i:
                return [i + 1, hashMap[y] + 1]