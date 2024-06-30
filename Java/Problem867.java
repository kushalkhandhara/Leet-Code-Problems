public class Problem867 
{
    public static int[][] transpose(int[][] matrix) 
    {
        int trans[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) 
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                trans[j][i] = matrix[i][j];
            } 
        }
        return trans;
    }
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3},{4,5,6}};
        int res[][] = transpose(arr);
        for (int i = 0; i<res.length; i++) 
        {
            for (int j = 0; j<res[i].length;j++)
            {
                System.out.println(res[i][j]);
            }
        }
    }
    
}
