class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        print(len(b))
        """
     
        unique_nums = []

        for num in nums:
            if num not in unique_nums:
                unique_nums.append(num)
        return unique_nums


sol = Solution()
# s = input("Enter String : ")
nums =[0,0,1,1,1,2,2,3,3,4]
result = sol.removeDuplicates(nums)
print(result)


