import java.util.*;

class Solution {
    public int countTriples(int n) {
        HashSet<Integer> squares = new HashSet<>();
        for (int x = 1; x <= n; x++) {
            squares.add(x * x);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int i2 = i * i;
            for (int j = 1; j <= n; j++) {
                int s = i2 + j * j;
                if (squares.contains(s)) {
                    count++;
                }
            }
        }
        return count;
    }
}
