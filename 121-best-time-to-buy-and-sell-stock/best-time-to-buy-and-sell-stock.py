class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_stock = prices[0]
        max_profit = 0

        for i in prices:
            if i < min_stock:
                min_stock = i
            else:
                profit = i - min_stock
                if profit > max_profit:
                    max_profit = profit
        
        return max_profit