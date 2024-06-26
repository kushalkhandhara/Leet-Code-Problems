// import java.util.*;
class Problem1512
{
    public static int numIdenticalPairs(int[] nums) 
    {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int nums[]={1,3,2};
        int result = numIdenticalPairs(nums);
        System.out.println("Result : "+result);

    }
}