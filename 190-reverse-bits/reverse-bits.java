class Solution {
    public int reverseBits(int n) {
        String bitValue = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String reversed = new StringBuilder(bitValue).reverse().toString();
        return Integer.parseInt(reversed, 2);
    }
}   