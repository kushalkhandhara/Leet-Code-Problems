class Problem832
{
    public static int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0;i<image.length;i++)
        {
            image[i] = ReverseImg(image[i]);
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image.length;j++)
            {
                System.out.print(image[i][j]+" ");
            }
        }
        for(int i=0;i<image.length;i++)
        {
            image[i] = FlipImg(image[i]);
        }
        return image;
    }



    public static int[] ReverseImg(int arr[])
    {
        int ans[] = new int[arr.length];
        int j =0;
        for(int i=arr.length-1;i>=0;i--)
        {
            ans[j] = arr[i];    
            j++;
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println("reverse"+ans[i]);
        // }
        return ans;
    }

    public static int[] FlipImg(int[] arr)
    {
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                ans[i] = 1;
            }
            else
            {
                ans[i] = 0;
            }
        }
        return ans;
    }



    public static void main(String[] args) 
    {
        int img[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int ans[][] = flipAndInvertImage(img);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}