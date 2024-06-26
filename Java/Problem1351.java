public class Problem1351 
{
    public static int countNegatives(int[][] grid) 
    {
        if(grid.length==1 && grid[0].length==1) 
        {
            if(grid[0][0]<1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int count=0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        } 
        return count;
        
    }
    public static void main(String[] args) 
    {
        int mat[][] = {{7,-2}};
        int result = countNegatives(mat);
        System.out.println("Result : " +result);
    }
    
}
