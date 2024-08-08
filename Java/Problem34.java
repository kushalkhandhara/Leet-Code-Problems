import java.util.*;
// public int[] searchRange(int[] nums, int target) 
// {

//     ArrayList<Integer> arr = new ArrayList<>();
//     int ans[] = new int[2];
//     int count = 0;
//     int n = nums.length;
//     if(nums.length==1 && nums[0]==target)
//     {
//         ans[0] = 0;
//         ans[1] = 0;
//         return ans;
//     }
//     for(int i=0;i<n;i++)
//     {
//         if(nums[i]==target)
//         {
//             count++;
//         }
//     }
//     if(count<1)
//     {
//         ans[0] =-1;
//         ans[1] = -1;
//         return ans;
//     }
//     for(int i=0;i<n;i++)
//     {
//         if(nums[i]==target)
//         {
//             arr.add(i);
//         }
//     }
//     if(arr.size()==1)
//     {
//         ans[0] = arr.get(0);
//         ans[1] = arr.get(0);
//         return ans;
//     }
//     if(arr.size()>1)
//     {
//         ans[0] = arr.get(0);
//         ans[1] = arr.get(arr.size()-1);
//         return ans;
//     }
//     for(int i=0;i<arr.size();i++)
//     {
//         ans[i] = arr.get(i);
//     }
//     return ans;
// }
public class Problem34 
{
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the first occurrence
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                end = mid - 1; // Continue to search in the left half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Find the last occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                start = mid + 1; // Continue to search in the right half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums = {5,7,7,8,8,10};
        int[] rslt = searchRange(nums,8);
        for(int i : rslt)
        {
            System.out.println(i);

        }

    }  
}
