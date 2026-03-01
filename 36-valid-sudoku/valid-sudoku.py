class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # Validating Rows
        for i in range(9):
            s = set()
            for j in range(9):
                value = board[i][j]
                if value in s:
                    return False
                elif value != '.':
                    s.add(value)
                
        # Validating Columns
        for i in range(9):
            s = set()
            for j in range(9):
                value = board[j][i]
                if value in s:
                    return False
                elif value != '.':
                    s.add(value)

        # Validating Boxes
        start = [(0, 0), (0, 3), (0, 6),
                 (3, 0), (3, 3), (3, 6),
                 (6, 0), (6, 3), (6, 6)
                ]

        for i, j in start:
            s = set()
            for row in range(i, i + 3):
                for col in range(j, j + 3):
                    value = board[row][col]
                    if value in s:
                        return False
                    elif value != '.':
                        s.add(value)
        
        return True