class Problem1346
{
    public static boolean checkIfExist(int[] arr) 
    {
        for (int i =0;i<arr.length;i++)
        {
            int n = arr[i]*2;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(n==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int nums[] = {3,1,7,11};
        boolean result = checkIfExist(nums);
        if(result)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}