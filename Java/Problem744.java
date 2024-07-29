
class Problem744
{
    public static char nextGreatestLetter(char[] letters, char target) 
    {
        int low = 0, high = letters.length - 1;
        char great = letters[0];
        while (low <= high)
        {
            int mid  = low + (high - low) / 2;

            // If x greater, ignore left half
            if (letters[mid] <= target)
            {
                low = mid + 1;
            }
            
            // If x is smaller, ignore right half
            else
            {
                great = letters[mid];
                high = mid - 1;
            }
        }
        
        return great;
    }
    public static void main(String[] args) 
    {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char ch = nextGreatestLetter(letters, target);
        System.out.println("Character : " + ch);
    }
}