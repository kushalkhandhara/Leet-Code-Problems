import java.util.*;
class Problem2824
{
    public static int countPairs(List<Integer> nums, int target) 
    {
        int count =0;
        for(int i=0; i<nums.size(); i++)
        {
            for(int j=i+1; j<nums.size(); j++)
            {
                int sum = nums.get(i) + nums.get(j);
                if(sum < target)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int result = countPairs(arr,-2);
        System.out.println("Result : "+result);
    }
}