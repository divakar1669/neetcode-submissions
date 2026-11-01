class Solution:


    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def normalize(string : str) -> str:
            s = sorted(string)
            return str(s)
        n = len(strs)
        maps = {}

        for i in range(0,n):
            s = strs[i]
            t = normalize(s)
            x = maps.get(t,[])
            x.append(s)
            maps[t] = x
        return  [ x for x in maps.values() ]

        # TC - O(N*logM) SC - O(N)

        