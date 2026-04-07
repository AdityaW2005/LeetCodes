class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null && digits.length() == 0) return result;

        String arr[] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTrack(result, new StringBuilder(), digits, 0, arr);
        return result;
    }

    private void backTrack(List<String> res, StringBuilder curr, String digits, int i , String[] arr) {
        if (i == digits.length()) {
            res.add(curr.toString());
            return;
        }

        String letters = arr[digits.charAt(i) - '0'];
        for (char letter : letters.toCharArray()) {
            curr.append(letter);
            backTrack(res, curr, digits, i + 1, arr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}