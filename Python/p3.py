class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums1.extend(nums2)
        nums1.sort()
        n = len(nums1)
        if n % 2 == 0:
            return (nums1[n // 2 - 1] + nums1[n // 2]) / 2.0
        else:
            return float(nums1[n // 2])

sol = Solution()
nums1 = [1, 2]
nums2 = [2, 3]
result = sol.findMedianSortedArrays(nums1, nums2)
print(result)
