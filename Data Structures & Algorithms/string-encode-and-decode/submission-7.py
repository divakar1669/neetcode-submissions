
from typing import List

class Solution:

    def encode(self, strs: List[str]) -> str:
        s = ""

        for st in strs:
            s += str(len(st)) + "$" + st

        return s

    def decode(self, s: str) -> List[str]:
        if s == "":
            return []

        result = []
        i = 0

        while i < len(s):
            j = i

            while s[j] != "$":
                j += 1

            length = int(s[i:j])
            word = s[j + 1 : j + 1 + length]

            result.append(word)
            i = j + 1 + length

        return result


