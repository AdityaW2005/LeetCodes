class Solution:
    def checkTwoChessboards(self, coordinate1: str, coordinate2: str) -> bool:
        d = {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6, 'g': 7, 'h': 8}
        l = []
        if coordinate1[0] in d.keys():
            if (d[coordinate1[0]] + int(coordinate1[-1])) % 2 == 0:
                l.append(True)
            else:
                l.append(False)
        if coordinate2[0] in d.keys():
            if (d[coordinate2[0]] + int(coordinate2[-1])) % 2 == 0:
                l.append(True)
            else:
                l.append(False)
        return l[0] == l[-1]
        