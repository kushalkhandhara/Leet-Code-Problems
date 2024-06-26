import java.util.*;
public class Problem1748 
{
    public static int sumOfUnique(int[] nums)
    {
        int sum = 0;
        int count = 1;
        ArrayList<Integer> unique = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            unique.add(nums[i]);
        }
        
        System.out.println("Map " + map);
        return 0;
    }
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3,2};
        int result = sumOfUnique(nums);
        System.out.println("Result : " + result);

        
    }
    
}