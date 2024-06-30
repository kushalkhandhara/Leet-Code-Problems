import java.util.*;
public class Problem2733 
{
    public static int findNonMinOrMax(int[] nums) 
    {
        if(nums.length<=2)
        {
            return -1;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) 
        {
            if(nums[i] > max) 
            {
                max = nums[i];
            }
        }
        int min = max;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        // System.out.println("Min : " + min);
        // System.out.println("Max : " + max);
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==max || nums[i]==min)
            {
                continue;
            }
            arr.add(nums[i]);
        }

        int ret = arr.get(0);

        return ret;

    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2};
        int result = findNonMinOrMax(arr);
        System.out.println("Result : " + result);
    }
}