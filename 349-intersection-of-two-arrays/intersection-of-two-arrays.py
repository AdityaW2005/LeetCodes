class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1, set2 = set(nums1), set(nums2)

        uniqueList = []

        for i in set1:
            if i in set2:
                uniqueList.append(i)

        return uniqueList