// import java.util.ArrayList;
import java.util.*;

public class Problem189 
{
    public static void rotate(int nums[],int k)
    {
        if(nums.length==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
            }
        }
        else if(k>nums.length)
        {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            int index = k;
            index = index%nums.length;
            int rev = nums.length;
            index = rev-index;
            
            for(int i = index; i < nums.length; i++)
            {
                list1.add(nums[i]);
            }
            for(int i = 0; i < index; i++)
            {
                list2.add(nums[i]);
            }
            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
            ArrayList<Integer> list3 = new ArrayList<Integer>();
            for(int i = 0; i < list1.size(); i++)
            {
                list3.add(list1.get(i));
            }
            for(int i = 0; i < list2.size();i++)
            {
                list3.add(list2.get(i));
            }
            System.out.println("List 3 : " + list3);
            for (int i = 0; i < list3.size(); i++)
            {
                nums[i]  = list3.get(i);
            }
        }
        else
        {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            int rev = nums.length;
            int index = rev-k;
            for(int i = index; i < nums.length; i++)
            {
                list1.add(nums[i]);
            }
            for(int i = 0; i < index; i++)
            {
                list2.add(nums[i]);
            }
            System.out.println("List 1: " + list1);
            System.out.println("List 2: " + list2);
            ArrayList<Integer> list3 = new ArrayList<Integer>();
            for(int i = 0; i < list1.size(); i++)
            {
                list3.add(list1.get(i));
            }
            for(int i = 0; i < list2.size();i++)
            {
                list3.add(list2.get(i));
            }
            System.out.println("List 3 : " + list3);
            for (int i = 0; i < list3.size(); i++)
            {
                nums[i]  = list3.get(i);
            }

        }

    }
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3};
        rotate(nums,4);
    } 
}