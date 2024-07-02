import java.util.*;
class Problem1909
{
    public static boolean canBeIncreasing(int[] nums) 
    {
        boolean result = false;
        HashSet<Integer> arr = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length;i++)
        {
            for(int j = 0; j < nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(nums[i]<nums[j])
                {
                    result = true;
                    arr.add(nums[i]);
                    
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println(arr);
        int ans[] = new int[arr.size()];
        int j =0;
        for(int k:arr)
        {
            ans[j] = k;
            j++;
        }
        for(int i=0;i<ans.length;i++)
        {
            // System.out.println(ans[i]);
            int n = i+1;
            if(i==ans.length-1)
            {
                break;
            }
            if(n==ans.length)
            {
                n = ans.length-1;
            }
            if(ans[i]<ans[n])
            {
                System.out.println("here");
                result = true;
            }
            else
            {
                return false;
            }
        }
        return result;
        
    }
    public static void main(String[] args)
    {
        int nums[] = {1,2,10,5,7};
        boolean result = canBeIncreasing(nums);
        if(result){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}