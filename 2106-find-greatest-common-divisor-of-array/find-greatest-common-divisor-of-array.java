import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        int a = Arrays.stream(nums).max().getAsInt();
        int b = Arrays.stream(nums).min().getAsInt();
        return gcd(a, b);
    }

    public int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}