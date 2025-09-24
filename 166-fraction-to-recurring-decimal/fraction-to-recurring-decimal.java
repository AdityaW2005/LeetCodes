class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        // Handle negative sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        
        // Convert to positive long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Integer part
        result.append(num / den);
        num %= den;
        
        if (num == 0) return result.toString();
        
        // Add decimal point
        result.append(".");
        
        // HashMap to store remainder -> index mapping
        Map<Long, Integer> remainderMap = new HashMap<>();
        
        while (num != 0) {
            if (remainderMap.containsKey(num)) {
                // Found repeating cycle
                int index = remainderMap.get(num);
                result.insert(index, "(");
                result.append(")");
                break;
            }
            
            // Store current remainder and its position
            remainderMap.put(num, result.length());
            
            num *= 10;
            result.append(num / den);
            num %= den;
        }
        
        return result.toString();
    }
}
