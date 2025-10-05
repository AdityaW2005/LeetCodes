class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for (int i : nums){
            if (i == 0) prod = 0;
            else if (i > 0) prod *= 1;
            else prod *= -1;
        }
        return signFunc(prod);
    }

    public int signFunc(int x){
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0; 
    }
}