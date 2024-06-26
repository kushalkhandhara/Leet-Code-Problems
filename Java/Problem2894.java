public class Problem2894 
{
    public static int differenceOfSums(int n, int m) 
    {
        int div[] = new int[n];
        int nodiv[] = new int[n];
        int d=0;
        int nd = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i%m==0)
            {
                div[d] = i;
                d++;
            }
            else
            {
                nodiv[nd] = i;
                nd++;
            }
        } 

        // Sum of Divison Numbers 
        int sumd=0;
        for(int i = 0; i < div.length; i++)
        {
            sumd+=div[i];
        }
        int nsumd=0;
        for(int i = 0; i < nodiv.length; i++)
        {
            nsumd+=nodiv[i];
        }
        // int r ;
        // if(sumd>nsumd)
        // {
        //     r = sumd-nsumd;
        // }
        // else
        // {
        //     r = nsumd-sumd;
        // }

        return nsumd-sumd;
    }
    public static void main(String[] args) 
    {
        int result =  differenceOfSums(5,1);
        System.out.println(result);
    }
    
}
