import java.util.*;
public class Problem287 
{
    public static int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        // boolean found = false;
        int n = -1;
        for (int num : nums) 
        {
            n = binarySearch(num,nums);
            if(n==-1)
            {
                continue;
            }
        }
        return n;
    }

    public static Integer binarySearch(int target, int[] nums)
    {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) 
    {
        int nums[] = {1,3,4,2,2};
        int result = findDuplicate(nums);
        System.out.println("Result : " + result);
        
    }
}
