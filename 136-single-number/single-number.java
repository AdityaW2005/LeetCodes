class Solution {
    public int singleNumber(int[] nums) {
        // Initialize a variable to 0. It will hold the XOR sum.
        int singleElement = 0;
        
        // Iterate through each number in the input array.
        for (int num : nums) {
            // Apply the XOR operation between the current number
            // and the accumulated XOR sum.
            singleElement ^= num;
        }
        
        // After the loop, the duplicates have canceled out,
        // leaving only the single number.
        return singleElement;
    }
}
