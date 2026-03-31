class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Brute - Force Approach
        """
        m, n = len(matrix), len(matrix[0])

        for i in range(m):
            for j in range(n):
                if matrix[i][j] == target:
                    return True
        
        return False
        """

        for row in matrix:
            if target in row:
                return True
        return False