class Problem121
{
    public static int maxProfit(int[] prices) 
    {
        int min=Integer.MAX_VALUE;
        int minInd=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min = prices[i];
                minInd = i;
            }
        }
        System.out.println("Min Ind : " + minInd);
        System.out.println("Min  : " + min);
        int len =prices.length-1;
        if(minInd==len)
        {
            return 0;
        }

        int max = min;
        int maxInd =minInd;
        for(int i=minInd;i<prices.length;i++)
        {
            if(prices[i]>max)
            {
                max = prices[i];
                maxInd = i;
            }
        }
        return maxInd+1;

    }

    public static void main(String[] args)
    {
        int arr[]= {7,6,4,3,1};
        int res = maxProfit(arr);
        System.out.println(res);

    }
}