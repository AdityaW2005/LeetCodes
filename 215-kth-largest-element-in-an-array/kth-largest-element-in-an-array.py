from queue import PriorityQueue
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pq = PriorityQueue()
        for i in nums:
            pq.put((-i, i))

        for i in range(k - 1):
            pq.get()
            
        return pq.get()[1]