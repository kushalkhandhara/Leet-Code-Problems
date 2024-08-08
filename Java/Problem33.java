public class Problem33 
{
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is at the mid
            if (nums[mid] == target) {
                return mid;
            }

            // Determine if the left half is sorted
            if (nums[start] <= nums[mid]) {
                // Check if the target is in the left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // Check if the target is in the right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // If the target is not found
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int rslt = search(nums, 0);
        System.out.println("Result : " + rslt);

    }
}
