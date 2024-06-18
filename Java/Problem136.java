public class Problem136 {
    public static int findSingle(int[] nums) 
    {

        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int singleElement = findSingle(arr);
        System.out.println("The single occurred element is: " + singleElement);
    }
}
