class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max_area = 0;

        while (i < j){
            int width = j - i;
            int min_height = Math.min(height[i], height[j]);
            int current_area = width * min_height;
            max_area = Math.max(max_area, current_area);

            if (height[i] < height[j])
                i++;
            else
                j--;
        }

        return max_area;

    }
}