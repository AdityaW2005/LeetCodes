class Solution:
    def sortVowels(self, s: str) -> str:
        # First set a list of strings of vowels
        # Iterate through the string 
        # Sort the vowels in ascending order 
        
        vowels = set('AEIOUaeiou')
        vowel_list = [c for c in s if c in vowels]
        vowel_list.sort()
        
        result = []
        j = 0  
        
        for c in s:
            if c in vowels:
                result.append(vowel_list[j])
                j += 1
            else:
                result.append(c)
        return ''.join(result)

