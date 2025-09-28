class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int digitSum = 0;
        int prod = 1;
        while (x > 0){
            int digit = x % 10;
            digitSum += digit;
            prod *= digit;
            x /= 10;
        }
        return n % (digitSum + prod) == 0;
    }
}