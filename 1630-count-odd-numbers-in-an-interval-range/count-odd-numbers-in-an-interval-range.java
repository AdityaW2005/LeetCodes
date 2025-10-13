class Solution {
    public int countOdds(int low, int high) {
        int length = high - low + 1;

        if (length % 2 == 1 && (high % 2 == 1 && low % 2 == 1)) {
            return (int) Math.ceil((double) length / 2);
        } else if (length % 2 == 1 && (high % 2 != 1 && low % 2 != 1)) {
            return length / 2;
        } else if (length % 2 == 0 && ((high % 2 == 1 && low % 2 == 0) || (high % 2 == 0 && low % 2 == 1))) {
            return (int) Math.ceil((double) length / 2);
        }

        return length / 2; 
    }
}
