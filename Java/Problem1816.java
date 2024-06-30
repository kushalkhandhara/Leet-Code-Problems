public class Problem1816 {

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" "); // Split the sentence into words
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k && i < words.length; i++) 
        {
            result.append(words[i]).append(" ");
        }
        
        // Remove the trailing space
        result.deleteCharAt(result.length() - 1);
        
        return result.toString();
    }

    public static void main(String[] args) {
        String result = truncateSentence("chopper is not a tanuki", 5);
        System.out.println("Result : " + result);
    }
}
