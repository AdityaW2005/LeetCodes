class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # Create a list of numbers from 0 to 9
        # Iterate throught the list and compare with the nums list
        # If count of the particular number is greater than 1 'continue'
        # Else return the nums element that has 1 frequency

        single_element = 0
        for i in nums:
            single_element ^= i
        return single_element 
        
        