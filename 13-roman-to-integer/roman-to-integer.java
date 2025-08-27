class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = 0;
            switch (s.charAt(i)) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }
            
            // If current value is less than previous, subtract it, else add it
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            
            prevValue = value;
        }
        
        return total;
    }
}
