class Solution:
    def isAnagram(self, s1: str, t1: str) -> bool:
        s = sorted(s1)
        t = sorted(t1)

        n,m = len(s) , len(t)

        if n!=m:
            return False
        
        for i in range(0,n):
            if s[i]!=t[i]:
                return False
            
        return True

        