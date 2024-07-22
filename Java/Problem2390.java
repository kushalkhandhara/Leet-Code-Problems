import java.util.Stack;

class Problem2390
{
    public static String removeStars(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!='*')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                stack.pop();
            }
        }
        System.out.println("Stack: " + stack);
        String res ="";
        for(int i = 0; i < stack.size(); i++)
        {
            res+=stack.get(i);
        }
        return res;
    }
    public static void main(String[] args) 
    {
        String result = removeStars("erase*****");
        System.out.println("Result : " + result);
    }
}