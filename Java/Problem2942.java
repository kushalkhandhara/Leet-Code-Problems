import java.util.*;

public class Problem2942 
{
    public static List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> result = new ArrayList<Integer>();
        int j=0;
        for(int i=0; i<words.length; i++)
        {
           boolean y = wordsMatch(words[i], x);
           if(y)
           {
            result.add(j,i);
            j++;
           }
        }
        return result;
    }
    public static boolean wordsMatch(String word, char x) 
    {
        boolean y = false;
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == x)
            {
                y = true;
            }
        }
        return y;
    }
    
    public static void main(String[] args) 
    {   
        String[] arr = {"leet","code"};
        List<Integer> result = new ArrayList<Integer>();
        result = findWordsContaining(arr,'e');
        System.out.println(result);
    }
    
}
