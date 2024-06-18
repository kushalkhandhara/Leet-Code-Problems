class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        st = s.strip()
        print(st)
        a = st.split(" ")
        b = len(a)
        ans = len(a[b-1])
        return ans 
sol = Solution()
s = input("Enter String : ")
# nums = [-1,0,1,2,-1,-4]
result = sol.lengthOfLastWord(s)
print(result)