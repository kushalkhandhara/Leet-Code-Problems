import java.util.*;
class Problem1002
{
    public static String commonChars(String[] words) 
    {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        ArrayList<Character> list = new ArrayList<Character>();
        String res = "";
        int count = 1;
        for(int i = 0; i < words.length; i++)
        {
            res+=words[i];
        }
        for(int i = 0; i < res.length(); i++)
        {
            map.put(res.charAt(i),1);
        }
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                if(map.containsKey(words[i].charAt(j)))
                {
                    list.add(words[i].charAt(j));
                }
            }
        }


        System.out.println(map);
        System.out.println(list);
        return res;
    }
    public static void main(String[] args) 
    {
        String[] words = {"bella","label","roller"};
        String res = commonChars(words);
        System.out.println(res);

    }
}