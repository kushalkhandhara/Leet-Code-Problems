class Problem43
{
    public static String multiply(String num1, String num2) 
    {
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int c = a*b;
        System.out.println(c);
        String d = Integer.toString(c);
        return d;

        
    }
    public static void main(String[] args)
    {
        String s = multiply("123456789", "3");
        System.out.println(s);

    }
}