public class Problem2108 
{
    public static String firstPalindrome(String[] words) 
    {
        for(int i=0; i<words.length; i++) 
        {
            if(isPalindrone(words[i])) 
            {
                return words[i];
            }
        }
        return "";
    }
    public static boolean isPalindrone(String word) 
    {
        String r="";
        for(int i=word.length()-1; i>=0; i--)
        {
            r+=word.charAt(i);
        } 
        if(r.equals(word))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        String[] words = {"abc","car","ada","racecar","cool"};
        String result = firstPalindrome(words);
        System.out.println("Result : " + result);
        
    }
    
}
