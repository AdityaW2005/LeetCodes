// public class Solution {
//     public int mySqrt(int x) {
//         if (x < 2) return x;

//         int left = 1, right = x / 2 + 1; // sqrt(x) <= x/2+1 for x>=2
//         int ans = 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (mid <= x / mid) {   // mid*mid <= x without overflow
//                 ans = mid;          // mid is feasible
//                 left = mid + 1;     // try bigger
//             } else {
//                 right = mid - 1;    // too big
//             }
//         }
//         return ans;
//     }
// }

//Newton's Method
public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        long y = x; // use long to avoid overflow in y*y
        while (y * y > x) {
            y = (y + x / y) / 2;
        }
        return (int) y;
    }
}
