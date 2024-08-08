public class Problem152 
{
    public static int maxProduct(int nums[])
    {
        int start =0;
        int end = nums.length;
        int pro =1;
        int max = Integer.MIN_VALUE;
        
        while(start < end)
        {
            pro *= nums[start];
            if(max<pro)
            {
                max = pro;
            }
            if(pro<0)
            {
                pro = 1;
            }
            start++;
        }
        return max;

    }
    public static void main(String[] args) {
        int nums[] = {-2,0,1};
        int result = maxProduct(nums);
        System.out.println("Result : " + result);
    } 
}
