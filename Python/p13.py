class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        final = -1

        if(len(nums) == 1 and nums[0] == 0):
            return 0
        
        if(len(nums)==1 and nums[0]>0):
            return nums[0]
        
        if(len(nums)==1 and nums[0]<0 and nums[0]<final):
                # return nums[0]
            return nums[0]
        
        if(len(nums)==1 and nums[0]<0 and nums[0]>=final):
                # return nums[0]
            return nums[0]
        
        for i in range(len(nums)-1):
            max = nums[i] * nums[i+1]
            if(final<max):
                final=max
            return final
        return final

sol = Solution()
# s = input("Enter String : ")
s = [-2]
result = sol.maxProduct(s)
print(result)
