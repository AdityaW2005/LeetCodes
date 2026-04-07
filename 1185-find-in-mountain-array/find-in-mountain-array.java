/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeak(arr);

        int left = binarySearch(arr, target, 0, peak, true);
        if (left != -1) return left;

        return binarySearch(arr, target, peak + 1, arr.length() - 1, false);
    }

    int findPeak(MountainArray arr) {
        int l = 0, r = arr.length() - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    int binarySearch(MountainArray arr, int target, int l, int r, boolean asc) {
        while (l <= r) {
            int mid = (l + r) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (asc) {
                if (val < target) l = mid + 1;
                else r = mid - 1;
            } else {
                if (val > target) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
}