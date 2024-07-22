class Problem647{
    public int countSubstrings(String s) 
    {
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            count++;
        }
        String st=""; 
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                st+=s.charAt(j);
                if(st.length()>1)
                {
                    if(isPalindrone(st))
                    {
                        
                        System.out.println(s);
                        count++;
                        // st="";
                    }

                }
            }
            st="";

        }
        return count;
    }
    public boolean isPalindrone(String s)
    {
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        System.out.println("rev :"+rev);
        if(s.equals(rev))
        {
            System.out.print(rev);
            return true;
        }
        else
        {
            return false;
        }
    }
}