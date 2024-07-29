import java.util.*;

class Problem2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums2); // Make sure nums2 is sorted for binary search
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                min = Math.min(min, num);
                found = true;
            }
        }

        if (!found) {
            throw new NoSuchElementException("No common element found");
        }

        return min;
    }

    private static boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 10, 12, 15, 16, 16, 25, 48, 51, 69, 74, 74, 78, 78, 78, 82, 82, 88};
        int[] nums2 = {3, 8, 9, 10, 13, 16, 24, 25, 27, 29, 34, 39, 55, 62, 70, 80, 83, 87, 92, 94};
        int result = getCommon(nums1, nums2);
        System.out.println("Result: " + result);
    }
}
