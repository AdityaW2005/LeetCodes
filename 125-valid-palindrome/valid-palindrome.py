class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = list(s)
        new_l = []

        for i in l:
            if i.isalpha():
                new_l.append(i.lower())
            elif i.isdigit():
                new_l.append(i)

        print(new_l)
        
        i, j = 0, len(new_l) - 1

        while i < j:
            if new_l[i] == new_l[j]:
                i += 1
                j -= 1
            else:
                return False
        return True
            