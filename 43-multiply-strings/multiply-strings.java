class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; --i) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; --j) {
                int d2 = num2.charAt(j) - '0';
                int mul = d1 * d2 + res[i + j + 1];
                res[i + j + 1] = mul % 10;
                res[i + j] += mul / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < res.length && res[k] == 0) k++;
        for (; k < res.length; k++) sb.append(res[k]);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
