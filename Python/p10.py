# import numpy as np

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # arr = np.array([], [])
        for i in range(len(nums)):
            for j in range(1,len(nums)):
                for k in range(2,len(nums)):
                    if(nums[i]+nums[j]+nums[k]==0 and  i != j and i != k and j != k ):
                        print(f"i {i} j {j}  k {k} : ",nums[i],nums[j],nums[k])
                        # print("j : ",nums[j]
                        # print("k : ",nums[k])

        
        # print(arr)

sol = Solution()
# s = input("Enter String : ")
nums = [-1,0,1,2,-1,-4]
result = sol.threeSum(nums)
print(result)