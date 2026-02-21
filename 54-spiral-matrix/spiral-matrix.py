class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        i, j = 0, 0
        up, right, down, left = 0, 1, 2, 3
        direction = right
        ans = []

        up_wall = 0
        right_wall = n
        down_wall = m
        left_wall = -1

        while len(ans) != m * n:
            if direction == right:
                while j < right_wall:
                    ans.append(matrix[i][j])
                    j += 1
                i, j = i + 1, j - 1
                right_wall -= 1
                direction = down
            
            elif direction == down:
                while i < down_wall:
                    ans.append(matrix[i][j])
                    i += 1
                i, j = i - 1, j - 1
                down_wall -= 1
                direction = left

            elif direction == left:
                while j > left_wall:
                    ans.append(matrix[i][j])
                    j -= 1
                i, j = i - 1, j + 1
                left_wall += 1
                direction = up

            else:
                while i > up_wall:
                    ans.append(matrix[i][j])
                    i -= 1
                i, j = i + 1, j + 1
                up_wall += 1
                direction = right
        
        return ans