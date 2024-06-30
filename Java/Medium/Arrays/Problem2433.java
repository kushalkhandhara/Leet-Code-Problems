public class Problem2433 
{
    public static int[] findArray(int[] pref) {
        int n = pref.length;
        int arr[] = new int[n];
        arr[0] = pref[0];

        for(int i=1; i<n; i++){
            arr[i] = pref[i-1]^pref[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]  = {5,2,0,3,1};
        int[] result = findArray(arr);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.println("Array"+result[i]);
        }
    }
}