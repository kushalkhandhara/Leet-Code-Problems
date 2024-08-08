import java.util.*;

public class Problem560 
{
    public static int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1); // To handle the case when subarray starts from index 0
        
        int count = 0;
        int sum = 0;
        
        for (int num : nums) 
        {
            sum += num;
            
            if (sumCount.containsKey(sum - k)) {
                count += sumCount.get(sum - k);
            }
            
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Map : " + sumCount);
        
        return count;
    }

    public static void main(String[] args) 
    {
        int[] nums = {1,1,1};
        int result = subarraySum(nums, 2);
        System.out.println("Result : " + result);

    }
    
}
