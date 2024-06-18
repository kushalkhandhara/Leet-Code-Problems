public class Problem1929 
{
    public static int[] getConcatenation(int[] nums) 
    {
        int size = nums.length*2;
        int n = nums.length;
        int arr[] = new int[size];
        for(int i = 0; i < n;i++)
        {
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3};
        int result[] = getConcatenation(a);
        for(int i = 0; i < result.length; i++) 
        {
            System.out.println(result[i]);
        }

    } 
}
