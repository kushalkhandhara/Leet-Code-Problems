class Problem2575
{
    public static int[] divisibilityArray(String word, int m) 
    {
        int ans[] = new int[word.length()];
        String s ="";
        
        for(int i = 0; i < word.length(); i++)
        {
            s+= word.charAt(i);
            System.out.println(s);
            k = new BigInteger(s);
            // BigInteger k = BigInteger.parseBigInteger(s);
            if(k%m==0)
            {
                ans[i] = 1;
            }
            else
            {
                ans[i] = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
    
        int result[] = divisibilityArray("529282143571",4);
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }

    }
}