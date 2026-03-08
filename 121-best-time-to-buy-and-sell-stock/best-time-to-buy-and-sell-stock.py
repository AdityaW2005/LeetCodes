class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_stock = prices[0]
        max_profit = 0

        for stock in prices:
            if stock < min_stock:
                min_stock = stock
            else:
                profit = stock - min_stock
                if profit > max_profit:
                    max_profit = profit
        
        return max_profit