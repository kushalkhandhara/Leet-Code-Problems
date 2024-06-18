class Solution {
    public static int vowelStrings(String[] words, int left, int right) 
    {
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            if((word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' ||  word.charAt(0)=='o' || word.charAt(0)=='u') && (word.charAt(word.length()-1) =='a' || word.charAt(word.length()-1) =='e' || word.charAt(word.length()-1) =='i' || word.charAt(word.length()-1) =='o' ||  word.charAt(word.length()-1) =='u'  ))
            {
                right+=1;

            }
        }
        return 0;
        
    }
    public static void main(String[] args) 
    {
        String[] words = {"are","amy","u"};
        int res = vowelStrings(words, 0,0);
        System.out.println(res);
        
    }
}