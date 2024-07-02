import java.util.*;
class Problem2643
{
    public static int[] rowAndMaximumOnes(int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int maxCount = 0;

        for (int i = 0; i < mat.length; i++) 
        {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) 
            {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            map.put(i, count);

            if (count > maxCount) 
            {
                maxCount = count;
                ans[0] = i; // Update the row index
                ans[1] = maxCount; // Update the max count of 1s
            } 
            else if (count == maxCount && i < ans[0]) 
            {
                ans[0] = i; // Update with the lowest index if counts are equal
            }
        }

        return ans;
    }
    public static void main(String[] args)
    {
        int arr[][] = {{0,1},{1,0}};
        int result[] = rowAndMaximumOnes(arr);
        for (int i = 0; i <result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}