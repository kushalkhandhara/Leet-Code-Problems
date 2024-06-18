public class Problem2180 
{
    public static int countEven(int num) 
    {
        int sum=0;
        for (int i = 1; i <= num; i++)
        {
            if(i<10)
            {
                if(i%2==0)
                {
                    sum+=1;
                }
            }
            else
            {
                if(sod(i))
                {
                    sum+=1;
                }
            }

        } 
        return sum;
    }
    public static boolean sod(int num) 
    {
        int sum=0;
        while(num!=0)
        {
            int r = num%10;
            sum+=r;
            num/=10;
        }

        if(sum%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    } 
    public static void main(String[] args) {
        System.out.println("Even Integers" + countEven(4));
    }
    
}
