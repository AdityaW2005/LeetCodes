class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversed1 = reverse(num);
        int reversed2 = reverse(reversed1);
        return num == reversed2;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
