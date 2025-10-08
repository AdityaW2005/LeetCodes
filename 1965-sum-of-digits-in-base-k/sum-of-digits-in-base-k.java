class Solution {
    public int sumBase(int n, int k) {
        int baseKDigitSum = 0;
        while (n > 0){
            baseKDigitSum += n % k;
            n /= k;
        }
        return baseKDigitSum;
    }
}