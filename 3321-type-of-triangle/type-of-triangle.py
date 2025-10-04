class Solution:
    def triangleType(self, nums: List[int]) -> str:
        a = nums[0] 
        b = nums[1] 
        c = nums[2]
        if a + b <= c or b + c <= a or a + c <= b:
            return "none"
        elif a == b == c:
            return "equilateral"
        elif (a + b > c or b + c > a or a + c > b) and (a != b and b != c and a != c):
            return "scalene"
        elif a == b or b == c or a == c:
            return "isosceles"
        