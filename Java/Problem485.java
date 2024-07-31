// public int findMaxConsecutiveOnes(int[] nums) {
//     int max = 0;
//     int sum = 0;
//     for (int num : nums) {
//         if (num == 1) {
//             sum++;
//         } else {
//             sum = 0;
//         }
//         max = Math.max(max, sum);
//     }
//     return max;
// }
// Best and Effective Solution and Working Solution is Above
// in Comments
public class Problem485 
{
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        if(nums.length ==1 && nums[0]==0)
        {
            return 0;
        }
        int minCount =0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                minCount++;
            }
        }
        if(minCount==nums.length)
        {
            return 0;
        }
        int count =1;
        int maxCount =1;
        for(int i = 0; i < nums.length-1; i++) 
        {
            if(nums[i]==nums[i+1])
            {
                count++;
                if(count>maxCount)
                {
                    maxCount = count;
                }
            }
            else
            {
                count = 1;

            }

        }
        return maxCount;

    }
    public static void main(String[] args) 
    {
        int[] nums = {0,0};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Result : " + result);
    }
    
}
