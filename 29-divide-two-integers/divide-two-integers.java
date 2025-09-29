class Solution {
    public int divide(int dividend, int divisor) {
        if ((dividend == Integer.MIN_VALUE && divisor == -1) || 
            (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            return (int) Math.floor((double) dividend / divisor);
        }
        
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            return (int) Math.ceil((double) dividend / divisor);
        }

        return 0;
    }
}
