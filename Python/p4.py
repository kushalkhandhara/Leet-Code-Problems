# Length of Longest Substring
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr = []
        n = len(s)
        
        for i in range(n):
            a = s[:i]
            # print(a)
            # print(i)
            arr.append(a)

        print(arr)

        for i in range(1,len(arr)):
            print(arr[i])





        

sol = Solution()
s = input("Enter String : ")
result = sol.lengthOfLongestSubstring(s)
print(result)
