import java.util.*;
public class Problem34 
{
    public static int[] searchRange(int[] nums, int target) 
    {

        ArrayList<Integer> arr = new ArrayList<>();
        int ans[] = new int[2];
        int count = 0;
        int n = nums.length;
        if(nums.length==1 && nums[0]==target)
        {
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                count++;
            }
        }
        if(count<1)
        {
            ans[0] =-1;
            ans[1] = -1;
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                arr.add(i);
            }
        }
        System.out.println(arr);
        if(arr.size()==1)
        {
            ans[0] = arr.get(0);
            ans[1] = ans[0];
            System.out.println(ans[1]);
            return ans;
        }
        if(arr.size()>1)
        {
            ans[0] = arr.get(0);
            ans[1] = arr.get(arr.size()-1);
            return ans;
        }
        for(int i=0;i<arr.size();i++)
        {
            ans[i] = arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        int[] arr = {3,3,3};
        int[] result = searchRange(arr,3);
        // for(int i = 0; i < result.length; i++)
        // {
        //     System.out.println(result[i]);

        // }
        
    }
    
}
