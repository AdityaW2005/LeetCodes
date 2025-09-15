class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (brokenLetters.indexOf(letter) != -1) {
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}
