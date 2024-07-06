import java.util.*;
class Problem1470
{
    public static int[] shuffle(int[] nums, int n) 
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) 
        {
            if(i<=n-1)
            {
                arr1.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }

        int ans[] = new int[nums.length];
        int j1 = 0;
        int j2 = 0;
        for(int i = 0; i < nums.length; i++) 
        {
            if(i%2==0)
            {
                ans[i] = arr1.get(j1);
                j1++;
            }
            else
            {
                ans[i] = arr2.get(j2);
                j2++;
            }
        }
        return ans;

    }
    public static void main(String[] args) 
    {
        int arr[] = {2,5,1,3,4,7};
        int result[] = shuffle(arr,3);   
    }
}