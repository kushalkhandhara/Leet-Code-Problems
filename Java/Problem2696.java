import java.util.*;

public class Problem2696 
{
    public static int minLength(String s) 
    {
        Stack<String> stack = new Stack<String>();
        String myStr = s;
        for(int i = 0; i < s.length()-1; i++) 
        {
            int j = i + 1;
            // if(j==s.length())
            // {
                // continue;
            // }
            String str ="";
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            str = str+ c1 + c2;
            stack.push(str);
        }
        System.out.println(stack);

        return 0;
    }
    public static void main(String[] args) 
    {
        int result = minLength("ABFCACDB");
        System.out.println("Result: " + result);
    }
}
