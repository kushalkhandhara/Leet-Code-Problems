// import java.util.*;

public class Problem2176 
{
    public static int countPairs(int[] nums, int k) 
    {
        int pcount = 0;
        // int count = 1;

        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == nums[j] && (i*j)%k==0)
                {
                    pcount++;
                }
            }

        }
        return pcount;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,2,2,1,3};
        int result = countPairs(arr,2);
        System.out.println("Result : " + result);
    }
    
}
