import java.util.*;

public class Problem977 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];  // Square each element from nums
        }
        
        Arrays.sort(arr);  // Sort the squared values
        
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {-4, -1, 0, 3, 10};
        int result[] = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
