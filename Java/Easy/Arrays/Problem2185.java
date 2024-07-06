class Problem2185
{
    public static int prefixCount(String[] words, String pref) 
    {
        int count = 0;
        int n = pref.length();
        for(int i=0;i<words.length;i++)
        {
            String s = words[i];
            if(s.length()<n)
            {
                continue;
            }
            String sub = s.substring(0,n);

            if(sub.equals(pref))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        String words[] = {"leetcode","win","loops","success"};
        int count = prefixCount(words,"at");
        System.out.println(count);

    }
}