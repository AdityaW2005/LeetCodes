class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 2:
            return 0
        
        b = [False] * n  
        count = 0
        
        for i in range(2, int(n ** 0.5) + 1):
            if not b[i]:
                for j in range(i * i, n, i):
                    b[j] = True
        
        for i in range(2, n):
            if not b[i]:
                count += 1
        
        return count