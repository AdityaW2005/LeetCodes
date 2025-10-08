class Solution {
    public int sumBase(int n, int k) {
        int baseK = 0, digitSum = 0;
        
       while (n > 0){
            baseK = baseK * 10 + n % k;
            n /= k;
       }

        while (baseK > 0){
            digitSum += baseK % 10;
            baseK /= 10;
        }

        return digitSum;
    }
}