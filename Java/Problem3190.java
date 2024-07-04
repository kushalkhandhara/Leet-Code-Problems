class Problem3190
{
    public static int minimumOperations(int[] nums) 
    {
        int op = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%3==0)
            {
                op = op;
            }
            else
            {
                op = op + 1;
            }
        }
        return op;
        
    }
    public static void main(String[] args)
    {
        int nums[] = {3,6,9};
        int result = minimumOperations(nums);
        System.out.println("Result : " + result);
    }
}