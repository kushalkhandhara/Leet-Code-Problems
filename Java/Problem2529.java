class Problem2529
{
    public static int maximumCount(int[] arr)
    {
        int pos = 0;
        int neg = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                neg++;
            }
            if(arr[i] >0)
            {
                pos++;
            }
        }   
        return Math.max(pos, neg);
    }
}