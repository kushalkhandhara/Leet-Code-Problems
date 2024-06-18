public class Problem9 {
    public static boolean isPalindrome(int x) 
    {
        String s = Integer.toString(x);
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) 
    {
        boolean result = isPalindrome(121);
        if(result)
        {
            System.out.println("is palindrone");
        }
        else
        {
            System.out.println("is not palindrone");
        }
        
    }
    
}
