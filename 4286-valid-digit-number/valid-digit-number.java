class Solution {
    public boolean validDigit(int n, int x) {
        List<Integer> list = new ArrayList<>();

        if (n == 0) return false;
        while (n > 0) {
            int rem = n % 10;
            list.add(rem);
            n /= 10;
        }

        if (x == list.get(list.size() - 1) || !list.contains(x))
            return false;
        return true;
    }
}