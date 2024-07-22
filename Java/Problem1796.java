import java.util.*;
class Problem1796 {
    public static int secondHighest(String s) 
    {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            int k = s.charAt(i);
            if(k>=97 && k<=122)
            {
                continue;
                // int a = Integer.parseInt(String.valueOf(s.charAt));
            }
            else
            {
                int a = Integer.parseInt(String.valueOf(s.charAt(i)));
                arr.add(a);
            }
        }
        System.out.println(arr);
        if(arr.size()<1)
        {
            return -1;
        }
        else
        {
            int a[] = new int[arr.size()];
            int j=0;
            for(int i :arr)
            {
                a[j] = i;
                j++;
            }
            return a[a.length-2];
        }
        // return 0;
    }
    public static void main(String[] args) 
    {
        int res = secondHighest("dfa12321afd");
        System.out.println("Result :"+res);

    }
}