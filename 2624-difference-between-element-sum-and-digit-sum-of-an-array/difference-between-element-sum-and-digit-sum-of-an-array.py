class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        element_sum = sum(nums)
        digit_sum = 0
        for x in nums:
            n = x
            while n > 0:
                digit_sum += n % 10
                n //= 10
        return abs(element_sum - digit_sum)
