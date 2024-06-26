import java.util.*;
public class Problem1672 
{
    public static int maximumWealth(int[][] accounts) 
    {
        int smax = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < accounts.length; i++)
        {
            for(int j = 0; j < accounts[i].length; j++)
            {
                smax+=accounts[i][j];
            }
            arr.add(smax);
            smax = 0;
        } 
        System.out.println("ArrayList : " + arr);
        int max = Collections.max(arr);
        return max;        
    }
    public static void main(String[] args) 
    {
        int rows = 3;
        int cols = 2;
        
        int arr[][] = new int [rows][cols];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements : ");
        for(int i = 0; i < rows; i++) 
        {
            for(int j = 0; j < cols; j++) 
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        
        int result = maximumWealth(arr);
        System.out.println("Result : "+result);
        scanner.close();
    }
}
