class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (l <= r) {
            if (height[l] <= height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    water += leftMax - height[l];
                }
                l++;
            }

            else {
                if (height[r] >= rightMax) 
                    rightMax = height[r];
                else 
                    water += rightMax - height[r];
                r--;
            }
        }
        return water;
    }
}