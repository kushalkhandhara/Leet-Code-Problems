
public class Problem88 
{
    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        // int merge[] = new int[m+n];
        int count = -1;

        for(int i=0;i<m;i++)
        {
            count++;
            nums1[i] = nums1[i]; 
        }
        // count++;
        for(int j=0;j<n;j++)
        {
            count++;
            nums1[count] = nums2[j];
        }
        for(int i=0; i<nums1.length;i++)
        {
            System.out.println("Result : " + nums1[i]);
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        
        merge(nums1, 3, nums2, 3) ;
    }
    
}
