class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isBlack(coordinate1) == isBlack(coordinate2);
    }

    private boolean isBlack(String coord) {
        int file = coord.charAt(0) - 'a' + 1;
        int rank = coord.charAt(1) - '0';
        return ((file + rank) & 1) == 0;
    }
}
