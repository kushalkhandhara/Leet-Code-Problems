import java.util.*;
class Problem169
{
    public static int majorityElement(int[] nums)
    {
        if(nums.length==1)
        {
            return  nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] ==nums[i+1])
            {
                count++;
                map.put(nums[i],count);
            }
            if(nums[i]!=nums[i+1])
            {
                count = 1;
            }
        }
        System.out.println("HashMap : " + map);

        int max = Integer.MIN_VALUE;
        int re = 0;
        for(int k : map.keySet())
        {
            int value = map.get(k);
            if(value>max)
            {
                re = k;
                max = value;
            }
        
        }
        return re;
    }

    public static void main(String[] args)
    {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println("Result : " + result);

    }
}