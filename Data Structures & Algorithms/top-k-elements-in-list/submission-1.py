import heapq
from collections import Counter


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        freq = Counter(nums)
        pq =[]
        for x , count in freq.items():
            heapq.heappush(pq,(count ,x ))

            if len(pq)>k:
                heapq.heappop(pq)
            
            

        return [x for count,x in pq]


        
        