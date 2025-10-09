class Solution:
    def countTriples(self, n: int) -> int:
        squares = {x * x for x in range(1, n + 1)}
        count = 0
        for i in range(1, n + 1):
            for j in range(1, n + 1):
                if i * i + j * j in squares:
                    count += 1
        return count
