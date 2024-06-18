public class Problem342
{
    public static boolean isPowerOfFour(int n) 
    {
        if(n==0)
        {
            return false;
        }

        while(n!=1)
        {
            if(n%4!=0)
            {
                return false;
            }
            n/=4;
        }
        return true;
    }
 

    public static void main(String[] args)
    {
        boolean result = isPowerOfFour(16);
        if(result)
        {
            System.out.println("It is Power of 4");
        }
        else
        {
            System.out.println("It is not");
        }
    }
    
}
