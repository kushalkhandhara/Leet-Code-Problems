public class Problem26
{
    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;
    }
    
    public static void main(String[] args) {
        
        int arr[]  = {1};
        int k = removeDuplicates(arr); 
        System.out.println(k);
    }
    
}
