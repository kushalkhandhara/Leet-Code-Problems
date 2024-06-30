public class Problem2778 
{
    public static int sumOfSquares(int[] nums) 
    {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) 
        {
            if(len%(i+1) == 0)
            {
                sum=nums[i]*nums[i]+sum;
            } 
        }

        return sum;
        
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,7,1,19,18,3};
        int result = sumOfSquares(arr);
        System.out.println("result : " + result);

    }

}