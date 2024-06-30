public class Problem2319 
{
    public static boolean checkXMatrix(int[][] grid) 
    {
        boolean result =false;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(i==j)
                {
                    if(grid[i][j]!=0)
                    {
                        
                        result = true;
                    }
                    else
                    {

                        result = false;
                        return false;
                    }
                }
                else if(i+j==grid.length-1)
                {
                    if(grid[i][j]!=0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                        // break;
                        return result;
                    }
                }
                else
                {
                    if(grid[i][j]==0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                        // break;
                        return result;
                    }
                }
            } 
        }
        return result;
    }

        
    
    public static void main(String[] args) 
    {
        // {{5,7,0},{0,3,1},{0,5,0}}
        // {{0,0,0,0,1},{0,4,0,1,0},{0,0,5,0,0},{0,5,0,2,0},{4,0,0,0,2}}

        // 0 0 0 0 1
        // 0 4 0 1 0
        // 0 0 5 0 0
        // 0 5 0 2 0
        // 4 0 0 0 2
        int grid[][] = {{0,0,0,0,1},{0,4,0,1,0},{0,0,5,0,0},{0,5,0,2,0},{4,0,0,0,2}};
        boolean result = checkXMatrix(grid);
        if(result) 
        {
            System.out.println("it is ");
        }
        else
        {
            System.out.println("it is not ");
        }
    }
}
