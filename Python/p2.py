class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for i in range(len(nums)):
            for j in range(i, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

sol = Solution()
# nums = int(input("Enter List : "))
nums = [2,3,4,5]
target = int(input("Enter target : "))
result = sol.twoSum(nums,target)
print(result)



        