class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, digitSum = 0;
        while (n > 0){
            prod *= n % 10;
            digitSum += n % 10;
            n /= 10;
        }
        return prod - digitSum;
    }
}