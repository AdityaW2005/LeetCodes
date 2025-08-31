class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        if not strs:
            return ""
        
        strs.sort()
        first, last = strs[0], strs[-1]
        prefix = []
        
        for i in range(min(len(first), len(last))):
            if first[i] == last[i]:
                prefix.append(first[i])
            else:
                break
        return "".join(prefix)
