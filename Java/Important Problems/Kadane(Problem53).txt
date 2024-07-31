class Problem53
{
    public static int MaximumSubArray(int []nums)
    {
        int max_end = 0;
        int far = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++)
        {
            max_end = max_end + nums[i];
            if(max_end > far)
            {
                far = max_end;
            }
            if(max_end < 0)
            {
                max_end = 0;
            }
        }
        return far;
    }

    public static void main(String[] args) 
    {
        int arr[]  = {1};
        int result  = MaximumSubArray(arr);
        System.out.println(result);
        
    }
}