class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int i = 0;
        int d = 1;          

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int j = 0; j < numRows; j++) {
            rows[j] = new StringBuilder();
        }

        for (char ch : s.toCharArray()) {
            rows[i].append(ch);

            if (i == 0) {
                d = 1;       
            } else if (i == numRows - 1) {
                d = -1;      
            }

            i += d;
        }

        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            ans.append(rows[j]);
        }

        return ans.toString();
    }
}
