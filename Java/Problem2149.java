import java.util.*;



// Easy and Preferable Solution
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int [] arr= new int[nums.length]; 
//         int m =0;
//         int n =1;
//         int j = nums.length;
//         for(int i=0;i<j;i++){
//             if(nums[i]<0){
//              arr[n]=nums[i];
//              n=n+2;
//             }else{
//                 arr[m]=nums[i];
//                 m=m+2;
//             }
//         }
//         return arr;
//     }
// }

public class Problem2149 
{
    public static int[] rearrangeArray(int[] nums)
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]>0)
            {
                arr1.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }
        int p=0;
        int n=0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i%2==0)
            {
                nums[i] = arr1.get(p);
                p++;
            }
            else
            {
                nums[i] = arr2.get(n);
                n++;
            }
        }
        return nums;

    }

    public static void main(String[] args) 
    {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(nums);
        for(int i=0; i<result.length; i++) 
        {
            System.out.println("Result : " + result[i]);
        }
    }
}
