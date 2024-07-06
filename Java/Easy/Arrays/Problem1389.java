import java.util.*;

class Problem1389
{
    public static int[] createTargetArray(int[] nums, int[] index) 
    {
        int target[] = new int[nums.length];
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            list.add(index[i],nums[i]);
        }
        System.out.println(list);
        for(int i = 0; i < nums.length; i++)
        {
            target[i] = list.get(i);
        }
        return target;
    }
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,0};
        int index[] = {0,1,2,3,0};
        int result[] = createTargetArray(nums, index);
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(result[i]);

        }

    }
}