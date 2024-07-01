class Problem3033
{
    public static int[][] modifiedMatrix(int[][] matrix) 
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j]<0)
                {
                    matrix[i][j] = changeNum(i,j,matrix);
                }
            }
        }
        return matrix;
    }
    public static int changeNum(int rows,int cols,int arr[][])
    {   
        int max = arr[rows][cols];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(j==cols)
                {
                    if(arr[i][j]>max)
                    {
                        max  = arr[i][j];
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,-1},{1,2,-1},{7,8,9}};
        int result[][]  = modifiedMatrix(arr);
        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[i].length; j++)
            {
                System.out.println(result[i][j]);
            }
        }
    }
}