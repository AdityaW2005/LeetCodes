class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        List<Integer> rem = new ArrayList<>();
        
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int r = sum % 26;
            rem.add(r);
        }

        String result = "";
        for (int num : rem) {
            char ch = (char)('z' - num);
            result = result + ch;
        }

        return result;
    }
}