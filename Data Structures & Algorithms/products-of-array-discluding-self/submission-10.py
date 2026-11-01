class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        '''
        here i feel the idea is to get prefix and suffix array 
        prefix[i] = prod of all elements before the element 
        suffix[i] = prod of all elements after the element 

        ans[i] = prefix[i]*suffix[i]

        TC O(N)
        SC O(N)

        '''

        n = len(nums)
        prefix = [0 for i in range(0,n)]
        suffix = [0 for i in range(0,n)]
        ans =    [0 for i in range(0,n)]

        prefix[0]=1
        suffix[n-1]=1

        prod = 1
        suff = 1

        for i in range(0,n):
            
            prefix[i]=prod
            prod*=nums[i]

            j = n-i-1
            suffix[j]=suff
            suff*=nums[j]
            
            
        
        # print(prefix, suffix)
        for i in range(0,n):
            ans[i]=prefix[i]*suffix[i]
        return ans
    


        