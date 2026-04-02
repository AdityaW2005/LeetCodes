import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // if (nums == null || nums.length == 0) {
        //     return 0;
        // }

        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }

        // int longest = 0;

        // for (int num : set) {
        //     if (!set.contains(num - 1)) {
        //         int current = num;
        //         int length = 1;

        //         while (set.contains(current + 1)) {
        //             current++;
        //             length++;
        //         }

        //         longest = Math.max(longest, length);
        //     }
        // }

        // return longest;
        int n = nums.length;
        Arrays.sort(nums);
        int count=1;
        int longest=1;
        
        if(n==0){
            return 0;
        }
        int lastsmaller=nums[0];
        

        for(int i=1;i<n;i++){
            if(lastsmaller+1==nums[i]){
                count++;
                lastsmaller=nums[i];

            }
            else if(nums[i]!=lastsmaller){
                count=1;
                lastsmaller=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;



    }
}
