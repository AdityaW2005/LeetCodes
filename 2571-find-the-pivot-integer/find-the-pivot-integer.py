class Solution:
    def pivotInteger(self, n: int) -> int:
        if n == 1:
            return 1

        pivot = -1
        
        nums = []
        d1, d2 = {}, {}

        for i in range(1, n + 1):
            nums.append(i)
        
        for i in range(n):
            d1[i + 1] = sum(nums[i: ])
            d2[i + 1] = sum(nums[i::-1])

        for i in range(1, n + 1):
            if d1[i] == d2[i]:
                pivot = i

        return pivot