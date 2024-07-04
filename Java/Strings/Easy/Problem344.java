class Problem344
{
    public static void reverseString(char[] s)
    {
        char ans[] = new char[s.length];
        // ans = s;
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = s[i];
        }
        int j = 0;

        for(int i = s.length-1; i >=0; i--)
        {
            // System.out.println("s :"+s[i]);
            s[j] = ans[i];
            j++;
            // System.out.println("ans :"+ans[i]);
        }
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }

    }
    public static void main(String[] args) 
    {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch); 
    }
}