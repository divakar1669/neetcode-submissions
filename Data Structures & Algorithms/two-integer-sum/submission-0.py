class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        maps = {}
        n = len(nums)

        for i in range(0,n):
            x = nums[i]
            y = target - x
            if y in maps:
                return [maps[y],i]
            maps[x]=i
        return [-1,-1]

                
