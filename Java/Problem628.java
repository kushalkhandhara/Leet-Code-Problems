import java.util.*;
public class Problem628 
{
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int m1 = nums[n-1]*nums[n-2]*nums[n-3];
        int m2 = nums[0]*nums[1]*nums[n-1];
        if(m1>m2)
        {
           
            return m1;
        }
        else{
       
            return m2;
        }
    }
 
    
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4};
        int result = maximumProduct(arr);
        System.out.println("Result : "+result);
    }
    
}
