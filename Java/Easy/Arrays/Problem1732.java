class Problem1732 {
    public int largestAltitude(int[] gain) 
    {
        int alti = 0;
        int high = 0;
        for(int i=0;i<gain.length;i++)
        {
            alti+=gain[i];
            if(alti>high)
            {
                high = alti;
            }
        }
        return high;

    }
}