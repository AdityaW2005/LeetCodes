class Solution:
    def countTriples(self, n: int) -> int:
        squares = {x * x for x in range(1, n + 1)}
        count = 0
        for i in range(1, n + 1):
            i2 = i * i
            for j in range(1, n + 1):
                if i2 + j * j in squares:
                    count += 1
        return count
