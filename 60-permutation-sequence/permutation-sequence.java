class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
            list.add(i);
        }

        list.add(n);
        k--;
        StringBuilder ans = new StringBuilder();

        while (true) {
            int index = k / fact;
            ans.append(list.get(index));
            list.remove(index);
            k = k % fact;

            if (list.isEmpty())
                break;
            fact = fact / list.size();
        }

        return ans.toString();
    }
}