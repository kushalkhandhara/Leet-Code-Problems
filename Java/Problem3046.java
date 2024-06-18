public class Problem3046 
{
    public static boolean isPossibleToSplit(int[] nums) 
    {
        int size = nums.length;
        if(size%2==0)
        {
            
            int[] cnt = new int[101];  // make array variable as a cnt for storing frequency of every element.
            for(int i=0;i<nums.length;i++){   // iterate over the array and add frequency in the cnt array variable & check if frequency is more than 2 then return false.
                cnt[nums[i]-1]++;
                if(cnt[nums[i]-1]>2){
                    return false;
                }
            }
            return true; 
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,1,3,1,1,8,9,2};
        boolean result = isPossibleToSplit(arr);
        if(result) 
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
