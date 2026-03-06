class Solution:
    def maxArea(self, height: List[int]) -> int:
        i, j = 0, len(height) - 1
        max_area = 0

        while i < j:
            width = j - i
            min_height = min(height[i], height[j])
            current_area = width * min_height
            max_area = max(current_area, max_area)

            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
            
        return max_area