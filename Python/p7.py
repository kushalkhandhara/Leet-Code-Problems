class Solution:
    def strStr(self, haystack,needle):
        if len(haystack) < len(needle):
            return -1
        for i in range(len(haystack)):
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1

sol = Solution()
# s = input("Enter String : ")
haystack = "mississippi"
needle = "issip"
result = sol.strStr(haystack,needle)
print(result)