class Solution {
    public boolean detectCapitalUse(String word) {
        return word.substring(0, 1).toUpperCase().equals(word.substring(0, 1)) && word.substring(1).toLowerCase().equals(word.substring(1)) || word.equals(word.toUpperCase()) || word.equals(word.toLowerCase());
    }
}