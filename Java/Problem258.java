public class Problem258 
{
    public static int addDigits(int num) 
    {
        int sum = 0;
        while(num!=0)
        {
           int  r = num%10;
           sum = sum + r;
           num /= 10;
        }
        if(sum>=10)
        {
            int add = addDigits(sum);
            return add;
        }
        return sum;
        
        
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum of Digits :"+addDigits(38));
        
    }
    
}
