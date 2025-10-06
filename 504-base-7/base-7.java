class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";  

        boolean neg = num < 0;     
        int n = Math.abs(num);     
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {            
            sb.append(n % 7);     
            n /= 7;               
        }

        String res = sb.reverse().toString(); 
        return neg ? "-" + res : res;        
    }
}