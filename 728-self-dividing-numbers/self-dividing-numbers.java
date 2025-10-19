class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivNums = new ArrayList<>();
        for (int i = left; i <= right; i++){
            int n = i;
            boolean ok = true;
            while (n > 0){
                int digit = n % 10;
                if (digit == 0 || i % digit != 0){
                    ok = false;
                    break;
                } 
                n /= 10;
            }
            if (ok) selfDivNums.add(i);
        }

        return selfDivNums;
    }
}
