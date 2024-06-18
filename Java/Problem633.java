public class Problem633 {
    public static boolean judgeSquareSum(int c) 
    {
        int sum = 1;
        for(int i = 0; i < c; i++) 
        {
            int temp = i*i;
            int add = sum*sum + temp;
            if(add==c)
            {
                return true;
            }
            sum+=1;
        }
        return false;
    }
    public static void main(String[] args) {
        if(judgeSquareSum(5))
        {
            System.out.println("It is Sum Of Squares");
        }
        else
        {
            System.out.println("It is not Sum Of Squares");
        }
       
    }
}
