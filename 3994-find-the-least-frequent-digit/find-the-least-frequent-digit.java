class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        if (n == 0) {
            freq[0] = 1;
        } else {
            int x = n;
            while (x > 0) {
                int d = x % 10;
                freq[d]++;
                x /= 10;
            }
        }
        int minFreq = Integer.MAX_VALUE;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0 && freq[d] < minFreq) {
                minFreq = freq[d];
            }
        }
        for (int d = 0; d <= 9; d++) {
            if (freq[d] == minFreq) return d;
        }
        return 0;
    }
}
