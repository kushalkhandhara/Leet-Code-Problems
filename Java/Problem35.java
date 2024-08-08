// import java.lang.reflect.Array;
import java.util.*;
public class Problem35 {
    public static int searchInsert(int[] nums, int target) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length;i++)
        {
            arr.add(nums[i]);
        }
        if(!arr.contains(target))
        {
            arr.add(target);
        }
        Collections.sort(arr);
        int start  = 0;
        int end = arr.size()-1;
        while (start <= end) 
        {
            int mid = start + (end-start)/2;
            if(arr.get(mid) == target)
            {
                return mid;
            }
            if(arr.get(mid) < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int result = searchInsert(nums,0);
        System.out.println("Result : " + result);
    }
}
