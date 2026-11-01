class Solution:
    def isPalindrome(self, s: str) -> bool:
        text = s
        text = "".join(char for char in text.lower() if char.isalnum())

        n = len(text) 
        i,j = 0 , n-1

        while i<=j:
            if text[i]!=text[j]:
                return False
            i+=1
            j-=1

        return True
