class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, right = num;
        while (low <= right){
            long mid = (low + right) / 2;
            long res = mid * mid;
            if (res == num) return true;
            else if (res < num) low = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}