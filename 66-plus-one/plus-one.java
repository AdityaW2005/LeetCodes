import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        // Build string from digits
        StringBuilder sb = new StringBuilder();
        for (int d : digits) {
            sb.append(d);
        }

        // Parse, add 1
        BigInteger n = new BigInteger(sb.toString()).add(BigInteger.ONE);

        // Convert back to int[]
        String s = n.toString();
        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i) - '0';
        }
        return ans;
    }
}
