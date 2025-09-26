class Solution {
    public int maximum69Number (int num) {
        if (num == 9999) {
            return num;
        }
        if (num == 96 || num == 69) {
            return 99;
        }
        if (num == 996) {
            return 999;
        }

        String a = String.valueOf(num);
        char[] l = a.toCharArray();

        if (num == 966 || num == 969) {
            l[1] = '9';
            int n = Integer.parseInt(new String(l));
            return n;
        }
        if (num <= 6999) {
            l[0] = '9';
            int n = Integer.parseInt(new String(l));
            return n;
        }
        if (num >= 9666 && num <= 9699) {
            l[1] = '9';
            int n = Integer.parseInt(new String(l));
            return n;
        }
        if (num == 9966 || num == 9969) {
            l[2] = '9';
            int n = Integer.parseInt(new String(l));
            return n;
        }
        if (num == 9996) {
            l[3] = '9';
            int n = Integer.parseInt(new String(l));
            return n;
        }

        return num;
    }
}
