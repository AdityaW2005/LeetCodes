class Solution {
    public int reverse(int x) {
        long rev = 0; // use long to catch overflow
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        rev *= sign;

        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
    }
}
