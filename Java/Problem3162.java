public class Problem3162
{
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) 
    {
        int count = 0;
        if(nums1.length == nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = 0; j < nums2.length; j++)
                {
                    if(nums1[i] % (nums2[j]*k) == 0)
                    {
                        System.out.println(i + " " + i);
                        count++;
                    }
                }
            }
        }
        else if(nums1.length<nums2.length)
        {
            for(int i = 0; i < nums1.length; i++)
            {
                for(int j = 0; j < nums2.length; j++)
                {
                    if(nums1[i] % (nums2[j]*k) == 0)
                    {
                        count++;
                    }
                }
            }
        }
        else
        {
            for(int i = 0; i < nums2.length; i++)
            {
                for(int j = 0; j < nums1.length; j++)
                {
                    if(nums1[i] % (nums2[j]*k) == 0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int arr1[] = {1,3,4};
        int arr2[] = {1,3,4};
        int result = numberOfPairs(arr1,arr2,1) ;
        System.out.println(result);
    }
}