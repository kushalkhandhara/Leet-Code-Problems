import java.util.*;


// Easiest Solution
// public void moveZeroes(int[] nums) {
//     int[] result = new int[nums.length];
//     int index = 0;

//     for (int i = 0; i < nums.length; i++) {
//         if (nums[i] != 0) {
//             result[index++] = nums[i];
//         }
//     }
//     while (index < nums.length) {
//         result[index++] = 0;
//     }
//     for (int i = 0; i < nums.length; i++) {
//         nums[i] = result[i];
//     }
// }



public class Problem283 
{
    public static void moveZeroes(int nums[])
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                list2.add(nums[i]);
            }
            else
            {
                list1.add(nums[i]);
            }
        }
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < list1.size(); i++)
        {
            list.add(list1.get(i));
        }
        for(int i = 0; i < list2.size(); i++)
        {
            list.add(list2.get(i));
        }
        System.out.println("list3: " + list);
        for(int i = 0; i < list.size(); i++)
        {
            nums[i] = list.get(i);
        }
    }

    public static void main(String[] args) 
    {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }   
}
