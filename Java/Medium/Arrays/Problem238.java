// import java.util.*;

public class Problem238 
{
    // public static int[] productExceptSelf(int[] nums) 
    // {
    //     ArrayList<Integer> arr = new ArrayList<Integer>();
    //     int ans[]  = new int[nums.length];
    //     int pro = 1;
    //     for(int i = 0; i < nums.length; i++) 
    //     {
    //         for(int j = 0; j < nums.length; j++)
    //         {
    //             if(i==j)
    //             {
    //                 continue;
    //             }
    //             else
    //             {
    //                 pro = pro*nums[j];
    //             }
    //         } 
    //         arr.add(pro);
    //         pro = 1;
    //     }
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         ans[i] = arr.get(i);            
    //     }
    //     return ans;
        
    // }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }
        
        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int result[] = productExceptSelf(arr);
        for(int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }
    }
}
