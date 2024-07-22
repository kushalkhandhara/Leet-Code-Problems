import java.util.*;
class Problem682
{
    public static int calPoints(String[] ops) 
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ops.length; i++)
        {
            if(ops[i].equals("D"))
            {
                int size = stack.size()-1;
                int num = stack.get(size)*2;      
                stack.push(num);
            }
            else if(ops[i].equals("C"))
            {
                stack.pop();
                // System.out.println("C");
            }
            else if(ops[i].equals("+"))
            {
                int n1 = stack.get(stack.size() - 1);  
                int n2 = stack.get(stack.size() - 2);  
                int sum = n1 + n2;
                stack.push(sum);
            }
            else
            {
                int a = Integer.parseInt(ops[i]);
                stack.push(a);
            }
        }
        System.out.println(stack);
        int ans = 0;
        for(int i = 0; i < stack.size(); i++)
        {
            ans+=stack.get(i);
        }
        return ans;      
    }
    public static void main(String[] args) 
    {
        String[] ops = {"1","C"};
        int res  = calPoints(ops);
        System.out.println("Result : " + res);
    }
}