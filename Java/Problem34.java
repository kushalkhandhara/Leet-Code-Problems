public class Problem34 
{
    public static int[] searchRange(int[] nums, int target)
    {
        // Assign a new array to nums
        int arr[] = new int[2];
        int j=0;
        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return new int[]{0,0};
            }
            else
            {
                return new int[]{-1,-1};
            }
        }


        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {  
                arr[j] = i;
                j+=1;
            }
        }
        

        return arr;
        
    }

    public static void main(String[] args) 
    {
        int[] arr = {1,3};
        int[] result = searchRange(arr,1);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);

        }
        
    }
    
}
