import java.util.ArrayList;
import java.util.List;
// nCr = (nCr-1 * n-r+1)/r

public class Problem118 
{
    public static List<List<Integer>> generate(int numRows) 
    {
        // Create the main list to hold all rows
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < numRows; i++)
        {            
            // Generate each row using nCr method
            List<Integer> row = nCr(i);
            arr.add(row);
        } 
        return arr;
    }

    // Method to generate each row of Pascal's Triangle
    public static List<Integer> nCr(int n)
    {
        List<Integer> arr = new ArrayList<>();
        int nCr = 1; // nC0 is always 1
        arr.add(nCr);
        
        for (int r = 1; r <= n; r++)
        {
            nCr = nCr * (n - r + 1) / r;
            arr.add(nCr);
        }
        
        return arr;
    }

    public static void main(String[] args) 
    {
        List<List<Integer>> result  = generate(14);
        System.out.println("Result : " + result);
    }    
}
