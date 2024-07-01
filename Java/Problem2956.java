import java.util.*;
class Problem2956
{
    public  static int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> arr = new HashSet<Integer>();
        int ans[]  = new int[nums1.length];
        if(nums1.length>nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = 0; j < nums2.length; j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        arr.add(nums1[i]);
                    }
                }
            }
        }
        if(nums2.length > nums1.length)
        {
            for(int i = 0; i < nums2.length; i++)
            {
                for(int j = 0; j < nums1.length; j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        arr.add(nums1[i]);
                    }
                }
            }
        }
        if(nums1.length == nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = 0; j < nums2.length; j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        arr.add(nums1[i]);
                    }
                }
            }
        }
        int m = 0;
        for(int k:arr)
        {
            ans[m] =  k;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr1[] = {2,3,2};
        int arr2[] = {1,2};
        int result[] = findIntersectionValues(arr1,arr2);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}