public class Problem1480 
{
    public int[] runningSum(int[] nums) 
    {
        int sum =0;
        int ans[] = new int[nums.length];
        int n;
        for(int i=0;i<nums.length;i++)
        {
            n = i;
            if(n==nums.length)
            {
                n = n-1;
            }
            for(int j =0; j<=n; j++)
            {
                sum = sum+nums[j];
            }
            ans[i] = sum;
            sum =0;
            
        }
        return ans;
    }
    
}
