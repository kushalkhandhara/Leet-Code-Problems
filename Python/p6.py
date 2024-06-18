class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        arr = []
        arr1 =  []

        for i in range(len(nums)):
            if(nums[i]==val):
                arr.append(nums[i])
            else:
                arr1.append(nums[i])
        print(arr1)
        return len(arr1)

            

sol = Solution()
# s = input("Enter String : ")
nums = [0,1,2,2,3,0,4,2]
val = 2
result = sol.removeElement(nums,val)
print(result)