import java.util.*;

class Problem268
{
    public static int missingNumber(int[] nums) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // int size = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        // if(!arr.contains(size))
        // {
        //     return size;
        // }
        for(int i=0; i<=arr.size(); i++)
        {
           int num = i;

            if(arr.contains(num))
            {
                continue;
            }
            else
            {
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(nums);
        System.out.println("Result : "+result);

    }
}