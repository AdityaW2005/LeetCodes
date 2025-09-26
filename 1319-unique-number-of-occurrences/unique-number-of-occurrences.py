class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        countOfOccurs = []
        sets = set(arr)
        # for i in sets:
        #     count = 0
        #     for j in arr:
        #         if i == j:
        #             count += 1
        #     countOfOccurs.append(count)
        for i in sets:
            countOfOccurs.append(arr.count(i))
            
        for i in countOfOccurs:
            if countOfOccurs.count(i) > 1:
                return False  
        return True