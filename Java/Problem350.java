import java.util.*;
class Problem350
{
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> intersection = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        
        return result;
    }

    public static void main(String[] args) 
    {
        int arr1[] = {1,2,2,1};
        int arr2[] = {2,2};
        int result[] =  intersect(arr1, arr2);
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}