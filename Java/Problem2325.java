import java.util.*;

class Problem2325 {
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();

        // Collect unique characters from the key, ignoring spaces
        for (char c : key.toCharArray()) {
            if (c != ' ') {
                set.add(c);
            }
        }

        // Map the collected characters to 'a' to 'z'
        char currentChar = 'a';
        for (char c : set) {
            map.put(c, currentChar);
            currentChar++;
        }

        // Decode the message using the map
        String decodedMessage = "";
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decodedMessage += ' ';
            } else {
                decodedMessage += map.get(c);
            }
        }

        return decodedMessage;
    }

    public static void main(String[] args) {
        String result = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        System.out.println("Result: " + result);
    }
}
