class Solution {
    public String convertDateToBinary(String date) {
        String[] l = date.split("-");
        StringBuilder s = new StringBuilder();
        for (String i : l) {
            s.append(Integer.toBinaryString(Integer.parseInt(i))).append('-');
        }
        s.deleteCharAt(s.length() - 1);
        return s.toString();
    }
}
