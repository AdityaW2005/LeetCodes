class Solution {
    public int maxProduct(int n) {
        String val = String.valueOf(n);
        char[] chars = val.toCharArray();
        Arrays.sort(chars);
        String value = new String(chars);
        int num = Integer.parseInt(value);
        int i = 1;
        int prod = 1;

        while (i >= 0) {
            prod *= num % 10;
            num /= 10;
            i--;
        }

        return prod;
    }
}