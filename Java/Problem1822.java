public class Problem1822 
{
    public static int arraySign(int[] nums) 
    {
        int negcount=0;
        int poscount=0;
        for(int i=0; i<nums.length; i++) 
        {
            if(nums[i] == 0) 
            {
                return 0;
            }
            if(nums[i]>0)
            {
                poscount++;
            }
            else
            {
                negcount++;
            }
        }
        if(negcount%2!=0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) 
    {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int result = arraySign(nums);
        System.out.println("Result : "+result);
        
    }
}
