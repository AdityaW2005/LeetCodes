# Brute Force Code

# class Solution:
#     def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
#         brokenLettersList = []
#         splitText = text.split()
#         count = 0
#         for i in brokenLetters:
#             brokenLettersList.append(i)
#         for word in splitText:
#             isBroken = False
#             for b in brokenLettersList:
#                 if b in word:
#                     isBroken = True
#                     break
#             if not isBroken:
#                 count += 1
#         return count

# Optimized Code
class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        broken = set(brokenLetters)
        return sum(all(c not in broken for c in word) for word in text.split())

