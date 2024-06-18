class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for i in range(len(nums)):
            if(nums[i]==target):
                return i
            
            if(nums[i]<target):
                return i+1 

sol = Solution()
# s = input("Enter String : ")
nums = [1,3,5,6]
target = 2
result = sol.searchInsert(nums,target)
print(result)