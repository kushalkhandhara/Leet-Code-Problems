import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem3 
{
    public static int lengthOfLongestSubstring(String s)
    {
        ArrayList<Character> data = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!(data.contains(s.charAt(i))))
            {
                data.add(s.charAt(i));
            }
        }
        
        System.out.println("Data : " + data);
        return 0;
    }
    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Result : " + result);
    }
}
