import java.util.*;

public class Problem2553 
{
    public static int[] separateDigits(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                list.add(nums[i]);
            }
            else
            {
                String s = Integer.toString(nums[i]);
                for(int j=0; j<s.length(); j++)
                {
                    int n = Integer.parseInt(String.valueOf(s.charAt(j)));
                    list.add(n);
                }
            }

        }
        int ans[] = new int[list.size()];
        for(int i=0; i<list.size();i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
        
    }

    public static void main(String[] args) 
    {
        int[] arr = {13,25,83,77};
        int[] result = separateDigits(arr);
        for(int i = 0; i < result.length; i++) 
        {
            System.out.println("Result : " + result[i]);
        } 

    }
    
}
