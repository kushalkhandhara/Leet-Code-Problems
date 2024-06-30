class Problem2011
{
    public static int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].equals("X++") || operations[i].equals("++X")) 
            {
                x++;
            }
            else
            {
                x--;

            }
        }
        return x;
    }
    public static void main(String[] args) {
        String[] arr =  {"++X","++X","X++"};
        int result = finalValueAfterOperations(arr);
        System.out.println("Result : "+result);
    }
}