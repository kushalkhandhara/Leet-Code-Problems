import java.util.*;
class Problem3024
{
    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] + nums[1] <= nums[2]) return "none";
        if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        if(nums[0] == nums[1] || nums[1] == nums[2]) return "isosceles";
        return "scalene";
    }
    public static void main(String[] args) 
    {
        int arr[] ={8,4,4};
        String result = triangleType(arr);
        System.out.println("Result : " + result);

    }
}