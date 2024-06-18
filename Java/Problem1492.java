import java.util.*;

public class Problem1492 
{
    public static int kthFactor(int n, int k) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                arr.add(i);
            }
        } 
        if(arr.size()<k)
        {
            return -1;
        }
        if(k==arr.size())
        {
            int n1 = arr.size()-1;
            return arr.get(n1);
        }
        return arr.get(k-1);
    }
    public static void main(String[] args) 
    {
        System.out.println("Number : "+kthFactor(12,3));


    }
    
}
