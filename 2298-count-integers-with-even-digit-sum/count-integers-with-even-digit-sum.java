class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (sumDigit(i) % 2 == 0) count++;
        }
        return count;
    }

    public int sumDigit(int x){
        int sumOfDigit = 0;
        while (x > 0){
            int digit = x % 10;
            sumOfDigit += digit;
            x /= 10;
        }
        return sumOfDigit;
    }
}