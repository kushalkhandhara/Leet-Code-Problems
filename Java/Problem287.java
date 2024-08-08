import java.util.*;
public class Problem287 
{
    public static int findDuplicate(int[] nums) 
    {
        int n=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        } 

        return n;
    }

    public static void main(String[] args) 
    {
        int nums[] = {1,3,4,2,2};
        int result = findDuplicate(nums);
        System.out.println("Result : " + result);
        
    }
}
