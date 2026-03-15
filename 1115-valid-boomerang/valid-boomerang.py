class Solution:
    def isBoomerang(self, points: List[List[int]]) -> bool:
        x, y = [], []

        for i in range(3):
            x.append(points[i][0])
            y.append(points[i][1])

        area = 0.5 * (x[0] * (y[1] - y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1]))

        if area == 0:
            return False
        return True