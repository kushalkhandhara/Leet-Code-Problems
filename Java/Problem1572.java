import java.util.*;
class Problem1572
{
    public static int diagonalSum(int[][] arr)
    {
        if(arr[0].length==1 || arr[1].length==1)
        {
            return arr[0][0];
        }
        int pr = 0;

        // Primary Diagonal
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j < arr[1].length; j++)
            {
                if(i==j || (i+j)==(arr[0].length-1))
                {
                    pr+=arr[i][j];
                }
            }
        }
        return pr;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Matrix : ");
        int n = scanner.nextInt();

        int mat[][] = new int[n][n];
        

        
        System.out.println("Enter Matrix : ");
        for(int i = 0; i < mat[0].length; i++)
        {
            for(int j = 0; j < mat[1].length; j++)
            {
                mat[i][j] = scanner.nextInt();
            }
        }
        int result = diagonalSum(mat);
        System.out.println("Result : "+result);
        scanner.close();
    }
}