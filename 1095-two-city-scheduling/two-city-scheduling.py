class Solution:
    def twoCitySchedCost(self, costs: list[list[int]]) -> int:
        # Number of people per city
        n = len(costs) // 2
        # Sort by (costA - costB): cheaper to send to A comes first
        costs.sort(key=lambda x: x[0] - x[1])
        
        total = 0
        # First n go to A, remaining go to B
        for i in range(n):
            total += costs[i][0] + costs[i + n][1]
        return total
