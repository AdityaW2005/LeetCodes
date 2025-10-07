class Solution:
    def checkTwoChessboards(self, coordinate1: str, coordinate2: str) -> bool:
        return self._is_black(coordinate1) == self._is_black(coordinate2)

    def _is_black(self, coord: str) -> bool:
        file_num = ord(coord[0]) - ord('a') + 1
        rank = int(coord[1])
        return ((file_num + rank) % 2) == 0
