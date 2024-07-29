// import java.util.Arrays;
import java.util.*;
// import java.util.List;

class Problem2089
{
    public static List<Integer> targetIndices(int[] nums, int target) 
    {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) 
    {
        int nums[] = {53,8,12,80,99,6,39,15,64,31,17,12,98,79,6,69,99,67,93,30,76,9,3,77,45,77};
        List<Integer> list = new ArrayList<Integer>();
        list = targetIndices(nums, 99);
        
        System.out.println("Ans : " + list);
    }
}