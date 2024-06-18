public class Problem326 
{
    public static boolean isPowerOfThree(int n) 
    {
        if(n==0)
        {
            return false;
        }

        while(n!=1)
        {
            if(n%3!=0)
            {
                return false;
            }
            n/=3;
        }
        return true;
    }
 

    public static void main(String[] args)
    {
        boolean result = isPowerOfThree(177146);
        if(result)
        {
            System.out.println("It is Power of 3");
        }
        else
        {
            System.out.println("It is not");
        }
    }
    
}
