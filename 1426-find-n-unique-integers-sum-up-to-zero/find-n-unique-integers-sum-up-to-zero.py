class Solution:
    def sumZero(self, n: int) -> List[int]:
        l = []
        
        
        
        if n % 2 == 1:
            l.append(0)
            for i in range(1, (n // 2) + 1):
                l.append(i)
                l.append(-1 * i)
        else:
            for i in range(1, (n // 2) + 1):
                l.append(i)
                l.append(-1 * i)
        return l
