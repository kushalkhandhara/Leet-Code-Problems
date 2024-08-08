import java.util.*;


// Follow this method for leet code output
// public static int longestConsecutive(int[] nums) 
// {
//     // Initialize the HashSet to remove duplicates and for O(1) access
//     HashSet<Integer> set = new HashSet<Integer>();

//     for(int num : nums)
//     {
//         set.add(num);
//     }
//     System.out.println("Set: " + set);

//     // If the input array is empty, return 0
//     if(nums.length == 0)
//     {
//         return 0;
//     }

//     // Initialize maxCount to keep track of the maximum length of consecutive sequence
//     int maxCount = 0;

//     for(int num : set)
//     {
//         // Only start counting if `num` is the beginning of a sequence
//         if(!set.contains(num - 1))
//         {
//             int currentNum = num;
//             int count = 1;

//             // Count the length of the current sequence
//             while(set.contains(currentNum + 1))
//             {
//                 currentNum++;
//                 count++;
//             }

//             // Update maxCount if the current sequence is longer
//             maxCount = Math.max(maxCount, count);
//         }
//     } 

//     return maxCount;
// }
public class Problem128 
{
    public static int longestConsecutive(int[] nums) 
    {
        if(nums.length ==1)
        {
            return 1;
        }
        ArrayList<Integer> set = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }
        Collections.sort(set);
        System.out.println("Set"+set);
        int j = 0;
        int arr[]  = new int[set.size()];
        for(int s:set)
        {
            arr[j] = s;
            j++;
        }
        System.out.println(set);



        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++)
        {
            int k = arr[i]+1;
            if(k==arr[i+1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count>maxCount)
            {
                maxCount = count;
            }
        } 

        return maxCount;
    }
    public static void main(String[] args) 
    {
        int nums[] = {0};
        int result  =longestConsecutive(nums);
        System.out.println("Result : " + result);
        
    }
    
}