import java.util.*;

public class Problem73 
{
    public static void setZeroes(int[][] matrix) 
    {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
        for(int i = 0; i <matrix.length; i++) 
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                // System.out.print(matrix[i][j]+" ");
                if(matrix[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
            System.out.println();
        }


        for(int i = 0; i <matrix.length; i++) 
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(row.contains(i))
                {
                    matrix[i][j] = 0;
                }
                if(col.contains(j))
                {
                    matrix[i][j] = 0;
                }

            }
        }
        System.out.println("Row : "+row);
        System.out.println("Col : "+col);

        for(int i = 0; i <matrix.length; i++) 
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) 
    {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix); 
        
    }
    
}
