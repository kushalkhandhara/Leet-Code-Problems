import java.util.*;
class Problem3024
{
    public static String triangleType(int[] nums) 
    {
        if(nums[0]==nums[1] && nums[1]==nums[2] && nums[2]==nums[0])
        {
            return "equilateral";
        }
        if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0])
        {
            if(nums[0]==nums[1])
            {
                if((nums[0]*nums[0] + nums[1]*nums[1])==(nums[2]*nums[2]))
                {
                    return "isosceles";
                }
                if(nums[1]==nums[2])
                {
                    if(nums[1]*nums[1] + nums[2]*nums[2]==nums[0]*nums[0])
                    {
                        return "isosceles";
                    }
                }
                if(nums[0]==nums[2])
                {
                    if(nums[0]*nums[0] + nums[2]*nums[2]==nums[1]*nums[1])
                    {
                        return "isosceles";
                    }
                }
                else
                {
                    return "none";
                }
            }

        }
        else if((nums[0]+nums[1]>nums[2]) && (nums[1]+nums[2]>nums[0]) && (nums[2]+nums[0]>nums[1]) )
        {
            return "scalene";
        }
        else
        {
            return "none";
        }
        return "none";
    
    }
    // public static String Findtri(int[] nums)
    // {
    //     Arrays.sort(nums);
    //     int hyp = nums[2]*nums[2];
    //     int s1 = nums[1]*nums[1];
    //     int s2 = nums[0]*nums[0];
    //     if((s1+s2)==hyp)
    //     {
    //         return "scalene";
    //     }
    //     else
    //     {
    //         return "none";
    //     }

    // }
    public static void main(String[] args) 
    {
        int arr[] ={8,4,4};
        String result = triangleType(arr);
        System.out.println("Result : " + result);

    }
}