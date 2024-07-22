import java.util.*;
class Problem728 {
    public static List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            // int n =i;
            if(i<10)
            {
                ans.add(i);
            }
            else
            {
                if(selfdivide(i))
                {
                    ans.add(i);
                }
            }
        } 
        return ans;
    }

    public static boolean selfdivide(int n)
    {
        int temp = n;
        boolean tr = true;
        while(n!=0)
        {
            int r = n%10;
            if(r==0)
            {
                return false;
            }
            if(temp%r==0)
            {
                tr =  true;
            }
            else
            {
                return false;
            }
            n = n/10;
        }
        return tr;
    }
    public static void main(String[] args)
    {
        List<Integer> result = selfDividingNumbers(1,22);
        System.out.println(result);
    }
        
    
}