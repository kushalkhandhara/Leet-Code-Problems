import java.util.*;

public class Problem56 
{
    public static int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));


        for(int i=0; i<intervals.length; i++) 
        {
            for(int j=0; j<intervals[i].length; j++)
            {
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }




        

        int[][] result = {{1},{1}};
        return result;
    }

    public static void main(String[] args)
    {
        int[][] mat = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(mat);
        for(int i = 0; i < result.length; i++) 
        {
            for(int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            } 
            System.out.println();
        }
    }
}
