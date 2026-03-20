class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Two-Pointer Approach
        """
        nums1.sort()
        nums2.sort()
        result = []
        i, j = 0, 0
        
        while i < len(nums1) and j < len(nums2):
            if nums1[i] == nums2[j]:
                result.append(nums1[i])
                i += 1
                j += 1
            elif nums1[i] < nums2[j]:
                i += 1
            else:
                j += 1
        
        return result
        """

        # Optimal Approach
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        
        count = Counter(nums1)
        result = []

        for num in nums2:
            if count[num] > 0:
                result.append(num)
                count[num] -= 1

        return result