import java.util.*;
class Problem2418
{
    public static String[] sortPeople(String[] names, int[] heights) 
    {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (heights[j] < heights[j + 1]) // Sort in descending order of heights
                {
                    // Swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;
    
                    // Swap names to maintain the correspondence
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        return names;
    }
    

    public static void main(String[] args) 
    {
        String[] names = {"Alice","Bob","Bob"};
        int heights[] = {155,185,150};
        String[] name = sortPeople(names, heights);
        for(int i = 0; i < names.length; i++)
        {
            System.out.println("names : " + name[i]);

        }

        
    }
}