import java.util.*;

public class Problem1255 
{
    public static int maxScoreWords(String[] words, char[] letters, int[] score) 
    {
        LinkedHashSet<Character> set1 = new LinkedHashSet<>();//letters
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();//score
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        ArrayList<Integer> arr = new ArrayList<>();


        for(int i = 0; i < letters.length; i++)
        {
            
            set1.add(letters[i]);
        }
        for(int i = 0; i < score.length; i++)
        {
            if(score[i] ==0)
            {
                continue;
            }
            set2.add(score[i]);
        }

        // Characters
        char[] let = new char[set1.size()];
        int j =0;
        for(char m:set1)
        {
            let[j] = m;
            j++;
        }


        // Integers
        int[] digit = new int[set2.size()];
        int u = 0;
        for(int n : set2)
        {
            digit[u] = n;
            u++;
        }

        // Map
        for(int i = 0; i < digit.length; i++)
        {
            map.put(let[i], digit[i]);
        }

        // Score sum
        int sum = 0;
        for(int i = 0; i < words.length; i++)
        {
            for(int k = 0;k< words[i].length(); k++)
            {
                System.out.println(words[i].charAt(k));
                if(map.containsKey(words[i].charAt(k)))
                {
                    System.out.println(map.get(words[i].charAt(k)));
                    sum+=map.get(words[i].charAt(k));
                }
                else
                {
                    sum+=0;
                }


            }
            arr.add(sum);
            sum = 1;
        }





        System.out.println("Score :" +set2);
        System.out.println("Letters :" +set1);
        System.out.println("Map :" +map);
        System.out.println("List :" +arr);



        return 0;
    }
    public static void main(String[] args) 
    {
        String words[] = {"dog","cat","dad","good"};
        char letters[] = {'a','a','c','d','d','d','g','o','o'};
        int score[] = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        int res = maxScoreWords(words,letters,score);
        System.out.println("Ans : " + res);
    }
    
}
