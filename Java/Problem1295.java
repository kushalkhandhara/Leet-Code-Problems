class Problem1295
{
    public int findNumbers(int[] nums) 
    {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(countDigits(nums[i])%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(int n)
    {
        int count = 0;
        while(n>0)
        {
            int r = n%10;
            n = n/10;
            count++;
        }
        return count;
    }
}