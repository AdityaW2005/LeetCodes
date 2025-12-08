class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # Brute - Force Solution
        """
        freq = {}
        for i in nums:
            if i in freq:
                freq[i] += 1
            else:
                freq[i] = 1

        for i in freq.keys():
            if freq[i] == 1:
                return i
        """

        # Shortest Solution
        """
        return (3 * sum(set(nums)) - sum(nums)) // 2
        """

        # Optimal Solution
        result = 0
        for i in range(32):  
            bit_sum = 0
            for num in nums:
                if (num >> i) & 1:
                    bit_sum += 1
            if bit_sum % 3:
                result |= (1 << i)
                
        if result >= 2**31:
            result -= 2**32

        return result