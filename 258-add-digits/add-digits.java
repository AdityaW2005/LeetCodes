class Solution {

    /**
     * A private helper method to calculate the sum of the digits of a number.
     * @param n The number to process.
     * @return The sum of the digits of n.
     */
    private int sumOfDigit(int n) {
        int currentSum = 0;
        int temp = n;
        
        while (temp > 0) {
            currentSum += temp % 10; // Add the last digit to the sum
            temp /= 10;              // Remove the last digit
        }
        
        return currentSum;
    }

    /**
     * Repeatedly adds all digits of a number until the result has only one digit.
     * @param num The non-negative integer to process.
     * @return The single-digit result.
     */
    public int addDigits(int num) {
        int currentNum = num;
        
        // Loop as long as the number has more than one digit
        while (currentNum >= 10) {
            currentNum = sumOfDigit(currentNum);
        }
        
        return currentNum;
    }
}
