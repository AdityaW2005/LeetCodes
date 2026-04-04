import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (int num : nums) numbers.add(num);

        int total = factorial(n);

        for (int k = 0; k < total; k++) {
            List<Integer> tempNums = new ArrayList<>(numbers);
            List<Integer> permutation = new ArrayList<>();

            int remaining = k;

            for (int i = n; i > 0; i--) {
                int fact = factorial(i - 1);
                int index = remaining / fact;

                permutation.add(tempNums.get(index));
                tempNums.remove(index);

                remaining = remaining % fact;
            }

            result.add(permutation);
        }

        return result;
    }

    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}