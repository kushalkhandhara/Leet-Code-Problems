import java.util.*;

public class Problem229 
{ 
    public static List<Integer> majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        // int n = nums.length;
        // int l = n/3; 
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], count);
        }    
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i]==nums[i+1]){
                count++;
                map.put(nums[i], count);
            }
            else
            {
                count =1;
            }
        }

        for(int k: map.keySet())
        {
            if(map.get(k)>nums.length/3)
            {
                result.add(k);
            }
        }

        System.out.println("HashMap " + map);
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        List<Integer> result = new ArrayList<Integer>();
        result = majorityElement(nums);
        System.out.println("Result : " + result);
    }   
}