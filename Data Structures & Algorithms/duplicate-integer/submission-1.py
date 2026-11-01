class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        maps = {}
        n = len(nums)
        for i in range(0,n):
            x = nums[i]
            if x in maps:
                return True
            maps[x] = True
        return False


        