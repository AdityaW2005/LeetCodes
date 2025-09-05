class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # First convert list as a string and change to int
        # Add 1 to it 
        # Convert as list again and display 
        s = ''
        for i in digits:
            s += str(i)
        s1 = int(s) + 1
        l = []
        for i in str(s1):
            l.append(int(i))
        return l