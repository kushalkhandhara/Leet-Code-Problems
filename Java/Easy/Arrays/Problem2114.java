import java.util.*;
class Problem2114
{
    public static int mostWordsFound(String[] sentences)
    {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < sentences.length; i++)
        {
            String word = sentences[i];
            String words[] = word.split(" ");
            for(int j = 0; j < words.length; j++)
            {
                count++;
            }
            ans.add(count);
            count = 0;
        }
        int max = Collections.max(ans);
        // System.out.println(ans);
        return max;
    }
    public static void main(String[] args) 
    {
        String[] words={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = mostWordsFound(words);
        System.out.println("Maximum Words : "+max);
    }
}