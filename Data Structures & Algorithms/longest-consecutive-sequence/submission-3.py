class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = sorted(nums)

        maxx = 1
        count =1


        n = len(nums)
        if n == 0:
            return 0
        
        for i in range(1,n):
            if nums[i] == nums[i-1]:
                continue
            elif nums[i] == nums[i-1]+1:
                count+=1
            else:
                count =1
            maxx =max(count,maxx)

        return maxx        