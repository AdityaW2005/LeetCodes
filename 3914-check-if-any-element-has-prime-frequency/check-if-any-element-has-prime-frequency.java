import java.util.*;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        List<Integer> frequencies = new ArrayList<>();
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        frequencies.addAll(freqMap.values());
        
        Set<Integer> uniqueFreqs = new HashSet<>(frequencies);
        
        for (int freq : uniqueFreqs) {
            if (isPrime(freq)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
