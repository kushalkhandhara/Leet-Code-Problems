import java.util.*;
class Problem414
{

    public static int thirdMax(int[] nums)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        for(int k:set)
        {
            list.add(k);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)); 
        }
        Collections.sort(list);
        if(list.size()==1)
        {
            return list.get(0);
        }
        if(list.size()==2)
        {
            return list.get(1);
        }
        if(list.size()==3)
        {
            return list.get(2);
        }


        int thirdMax = list.get(0);
        int max = list.get(0);
        int secondMax = list.get(0);
        // System.out.println(list.size());
        for(int i = 0; i <list.size(); i++) 
        {
            if(max < list.get(i)) 
            {
                max = list.get(i);
            }
        }
        System.out.println("Max : " + max);

        for(int i = 0; i <list.size(); i++)
        {
            if(list.get(i) > secondMax)
            {
                if(list.get(i) < max)
                {
                    secondMax = list.get(i);
                } 
            }  
        } 
        System.out.println("secondMax : " + secondMax);
        for(int i = 0; i <list.size(); i++)
        {
            if(list.get(i) < max)
            {
                if(list.get(i) < secondMax)
                {
                    thirdMax = list.get(i);
                } 
            }  
        } 
        System.out.println("thirdMax : " + thirdMax);

        return thirdMax;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2147483647,-2147483648};
        int result = thirdMax(arr);
        System.out.println(result);

    }

}