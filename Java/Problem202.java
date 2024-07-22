class Problem202 {
    public static boolean isHappy(int n) 
    {       
        int res = sumofSquares(n);
        while(res>10)
        {
            res = sumofSquares(res);
        }

        if(res==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sumofSquares(int num)
    {
        int sum = 0;
        while(num!=0)
        {
            int r = num%10;
            sum+=r*r;
            num = num/10;
        }

        return sum;       
    }
    public static void main(String[] args)
    {
        boolean res = isHappy(19);
        System.out.println(res);
    }
}