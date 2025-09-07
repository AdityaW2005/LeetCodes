class Solution {
    /**
     * Determines if a number is a "happy number" using Floyd's Cycle-Finding Algorithm.
     * All logic is inlined within this single function.
     * @param n A positive integer.
     * @return True if n is a happy number, and false if not.
     */
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            // Advance slow pointer by one step
            int s_slow = 0;
            int temp_slow = slow;
            while (temp_slow > 0) {
                int digit = temp_slow % 10;
                s_slow += digit * digit;
                temp_slow /= 10;
            }
            slow = s_slow;

            // Advance fast pointer by two steps
            for (int i = 0; i < 2; i++) {
                int s_fast = 0;
                int temp_fast = fast;
                while (temp_fast > 0) {
                    int digit = temp_fast % 10;
                    s_fast += digit * digit;
                    temp_fast /= 10;
                }
                fast = s_fast;
            }
        } while (slow != fast);

        // If the loop terminated because the pointers met, check if they met at 1.
        return slow == 1;
    }
}
