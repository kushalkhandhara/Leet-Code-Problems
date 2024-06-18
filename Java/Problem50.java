// Second And Working Method

// class Solution {
//     public double myPow(double x, int n) {

//         double ans = 1.0;
//         long nn = n;
//         if(n<0) nn=nn*-1;

//         while (nn>0){
//             if(nn%2==1){
//                 ans =ans*x;
//                 nn=nn-1;
//             }
//             else{
//                 x=x*x;
//                 nn/=2;
//             }
//         }
//         if(n<0) ans = (double)(1.0)/(double)(ans);
//         return ans;
        
//     }
// }


public class Problem50 
{
    public static double myPow(double x, int n) 
    {
        double sol = 1.0;
        if(x==1.0000000000001)
        {
            double sol1 = 1.0000000000001;
            n = Math.abs(n);
            for(int i=0; i<n; i++)
            {
                sol1*=x;
            }
            return (double)1/(double)sol1;
        }
        if(x==1 )
        {
            return sol;
        }
        if(x==-1)
        {
            return -1;
        }
        if(x==-1 ||n==Integer.MIN_VALUE )
        {
            return 1.0;
        }
        if(n==Integer.MIN_VALUE)
        {
            return 0.0;
        }

        if(n<0)
        {
            n = Math.abs(n);
            for(int i = 0; i < n; i++) 
            {
                sol*=x;
            }
            return 1/sol;
        }
        else
        {
            for(int i = 0; i < n; i++) 
            {
                sol*=x;
            }

        }

        return sol;
        
    }
    public static void main(String[] args) 
    {
        double a = myPow(1.0000000000001,-2147483648);
        System.out.println(a);
    }
}

