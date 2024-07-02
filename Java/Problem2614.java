import java.util.*;

class Problem2614 {
    public static int diagonalPrime(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // Check main diagonal
            if (isPrime(nums[i][i])) {
                System.out.println("Prime " + nums[i][i]);
                set.add(nums[i][i]);
            }
            // Check anti-diagonal
            if (isPrime(nums[i][nums.length - 1 - i])) {
                System.out.println("Prime " + nums[i][nums.length - 1 - i]);
                set.add(nums[i][nums.length - 1 - i]);
            }
        }
        if (set.isEmpty()) {
            return 0; // No prime found
        } else {
            int max = Collections.max(set);
            return max;
        }
    }

      public static boolean isPrime( int n){
          if(n==1) return false;
            if (n==2) return true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0) return false;
            }
            return true;
        }
    public static void main(String[] args) {
        int arr[][] = {{788, 645, 309, 559}, {624, 160, 435, 724}, {770, 483, 95, 695}, {510, 779, 984, 238}};
        int result = diagonalPrime(arr);
        System.out.println(result);
    }
}
