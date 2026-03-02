class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        for i in strs:
            sorted_i = ''.join(sorted(i))
            if sorted_i not in hashMap:
                hashMap[sorted_i] = []
            hashMap[sorted_i].append(i)
        
        return list(hashMap.values())