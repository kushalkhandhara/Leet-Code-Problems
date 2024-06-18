class Solution(object):
    def findMaxK(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arr2 = []
        arr1 = []
        for i in range(len(nums)):
            
            if(nums[i]<0):
                arr1.append(nums[i])

            if(nums[i]>0):
                arr2.append(nums[i])

        final = []
        for m in range(len(arr2)):
            b = arr2[m]
            for j in range(len(arr1)):
                a = arr1[j]
                if(a==b):
                    final.append(a)
        print("Final : ",final)



        
sol = Solution()
# s = input("Enter String : ")
nums = [-1,10,6,7,-7,1]
result = sol.findMaxK(nums)
print(result)