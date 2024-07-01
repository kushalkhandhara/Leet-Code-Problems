import java.util.*;
public class Problem1748 
{
    public static int sumOfUnique(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],count);
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(j==nums.length)
                {
                    j = nums.length -1;
                }
                if(nums[i]==nums[j])
                {
                    count++;
                    map.put(nums[j],count);
                }
            }
        }
        int sum = 0;
        for(int k : map.keySet())
        {
            if(map.get(k)<=1)
            {
                sum += k;
            }
        }
        System.out.println(sum);

        return sum;
    }
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3,4,5};
        int result = sumOfUnique(nums);
        System.out.println("Result : " + result);

        
    }
    
}