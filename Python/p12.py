class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        arr = s.split()
        # print(arr)

        ans=""
        for i in range(len(arr)-1,-1,-1):
            ans = ans + " " + arr[i]
        # print(ans.strip())
        return (ans.strip())

sol = Solution()
s = input("Enter String : ")
result = sol.reverseWords(s)
print(result)
