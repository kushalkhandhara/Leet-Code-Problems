class Problem7 {
    public static int reverse(int x) 
    {
         int rev = 0;
         if(x>=1534236469) 
         {
            return rev;
         }
        else if(x>0)
        {
            int rem; 
    
            while (x > 0) { 
                rem = x % 10; 
                rev = (rev * 10) + rem; 
                x = x / 10; 
            } 
        }
        else
        {
            int n = Math.abs(x);
            
           
            // remainder 
            int rem; 
    
            while (n > 0) { 
                rem = n % 10; 
                rev = (rev * 10) + rem; 
                n = n/ 10; 
            } 
            rev = rev*-1;

        }
        return rev;    
    }
    public static void main(String[] args) {
       int a =  reverse(-2147483412);
       System.out.println(a);

    }
}