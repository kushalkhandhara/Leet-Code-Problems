import java.util.*;
class Problem709
{
    public static String toLowerCase(String s) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            int a = s.charAt(i);
            System.out.println(a);
            if(a>=65 && a<=90)
            {
                a = a+32;
                arr.add(a);
            }
            else
            {
                a = a;
                arr.add(a);
            }
        }
        String st = "";
        for(int i=0; i<arr.size(); i++)
        {
            int val = arr.get(i);
            char c = (char) val;
            st = st+c;
        }
        System.out.println(st);

        return st;

    }
    public static void main(String[] args)
    {
        String s = "Hello";
        String result = toLowerCase(s);
        System.out.println(result); 
    }
}