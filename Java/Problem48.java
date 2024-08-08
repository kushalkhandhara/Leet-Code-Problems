public class Problem48{
    
    public static void rotate(int[][] matrix) 
    {
        // Make it to transpose 
        int n = matrix.length;
        for(int i=0; i<n-1; i++) 
        {
            for(int j=i+1; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Make it to revserse by two pointers approch
        for(int i=0; i<n;i++)
        {
            int start = 0;
            int end = n-1;
            while(start < end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp; 
                start++;
                end--;
            }
        }



        // Output 
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);

    } 
}
