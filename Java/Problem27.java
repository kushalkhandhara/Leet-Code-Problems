public class Problem27 
{
    public static int Remove(int[] nums,int val)
    {
        // if(nums.length == 1)
        // {
        //     return 0;
        // }

        // String removedElements = "";
        // String remainingElements = "";
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==val)
        //     {
        //         removedElements+=Integer.toString(nums[i]);
        //     }
        //     else
        //     {
        //         remainingElements+=Integer.toString(nums[i]);
        //     }
        // }
        // int a = remainingElements.length();

        // return a;
        int counter = 0;

    for (int num : nums){
        if (num != val){
            nums[counter++] = num;
        }
    }
    for(int i = 0; i < nums.length;i++)
    {
        System.out.println("NUms :" +nums[i]);
    }
    return counter;

  

    }
    public static void main(String[] args) 
    {
        int[] nums = {0,1,2,2,3,0,4,2};
        int result = Remove(nums,2);
        System.out.println(result);
    }
    
}
