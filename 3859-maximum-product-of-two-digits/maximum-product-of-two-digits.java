class Solution {
    public int maxProduct(int n) {
        int a = 0; 
        int b = 0; 
        int x = n;
        if (x == 0) return 0; 
        while (x > 0) {
            int d = x % 10;
            if (d >= a) {
                b = a;
                a = d;
            } else if (d > b) {
                b = d;
            }
            x /= 10;
        }
        return a * b;
    }
}
