public class Problem13 
{
    public static int romanToInt(String s) 
    {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            int currentVal = getValue(s.charAt(i));
            if (i + 1 < s.length() && currentVal < getValue(s.charAt(i + 1))) 
            {
                sum -= currentVal;
            } 
            else 
            {
                sum += currentVal;
            }
        }
        return sum;
    }

    public static int getValue(char c) 
    {
        switch (c) 
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // This case should not occur for valid Roman numerals
        }
    }

    public static void main(String[] args)
    {
        int result = romanToInt("III");  // Example test case
        System.out.println(result);      // Output: 3
        
        result = romanToInt("IV");       // Example test case
        System.out.println(result);      // Output: 4
        
        result = romanToInt("IX");       // Example test case
        System.out.println(result);      // Output: 9
        
        result = romanToInt("LVIII");    // Example test case
        System.out.println(result);      // Output: 58
        
        result = romanToInt("MCMXCIV");  // Example test case
        System.out.println(result);      // Output: 1994
    }
}
