import java.util.*;

class Problem442 {
    public List<Integer> findDuplicates(int[] nums) {

      ArrayList<Integer> dup=new ArrayList<>();

       if(nums.length ==0){
            return dup;
        }

      Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                dup.add(nums[i]);
            }
            // dup.add(-1);
        }
        // dup.add(-1);

        return dup;
        
    }

    
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}

























// import java.util.*;
// class Problem442
// {
//     public static List<Integer> findDuplicates(int[] nums) 
//     {
//         List<Integer> arr = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int count = 1;
//         for(int i = 0; i < nums.length; i++) 
//         {
//             map.put(nums[i], count);
//         }
//         for(int i = 0; i < nums.length; i++)
//         {
//             for(int j = 0; j < nums.length; j++)
//             {
//                 if(i==j)
//                 {
//                     continue;
//                 }
//                 if(nums[i]==nums[j])
//                 {
//                     count++;
//                     map.put(nums[i],count);
//                 }
//             }
//             count = 1;
//         }
//         for(int k : map.keySet())
//         {
//             if(map.get(k)>1)
//             {
//                 arr.add(k);
//             }
//         }
//         System.out.println(arr);
//         return arr;
        
//     }
//     public static void main(String[] args) 
//     {
//         int nums[] = {4,3,2,7,8,2,3,1};
//         List<Integer> ans = new ArrayList<>();
//         ans = findDuplicates(nums);
//         for (int i = 0; i < ans.size(); i++)
//         {
//             System.out.println(ans.get(i));
//         }
//     }
// }