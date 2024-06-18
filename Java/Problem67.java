public class Problem67 
{
        // Function to add two binary strings
        public static String add_Binary(String x, String y)
        {
     
            int num1 = Integer.parseInt(x, 2);
            // converting binary string into integer(decimal
            // number)
            System.out.println("Number 1 : " + num1);
     
            int num2 = Integer.parseInt(y, 2);
            // converting binary string into integer(decimal
            // number)
            System.out.println("Number 2 : " + num2);
     
            int sum = num1 + num2;
            // Adding those two decimal numbers and storing in
            // sum
     
            String result = Integer.toBinaryString(sum);
            // Converting that resultant decimal into binary
            // string
     
            return result;
        }
     
    public static void main(String[] args) 
    {
        String x = "11", y = "1";
 
        System.out.print(add_Binary(x, y));
    }
    
}
