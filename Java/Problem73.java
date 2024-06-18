public class Problem73 
{
    public static void setZeroes(int[][] matrix) 
    {
        for(int i = 0; i < matrix.length; i++) 
        {
            for(int j = 0; j < matrix[i].length; j++)
            {

                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();

        }
        
    }
    public static void main(String[] args) 
    {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix); 
        
    }
    
}
