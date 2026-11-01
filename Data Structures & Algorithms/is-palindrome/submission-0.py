class Solution:
    def isPalindrome(self, s: str) -> bool:
        text = s
        clean_text = "".join(char for char in text.lower() if char.isalnum())

        n = len(clean_text) 
        i,j = 0 , n-1

        while i<=j:
            if clean_text[i]!=clean_text[j]:
                return False
            i+=1
            j-=1

        return True
