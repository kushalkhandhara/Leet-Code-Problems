import java.util.*;

class Problem1678 {
    public static String interpret(String command) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("G", "G");
        map.put("()", "o");
        map.put("(al)", "al");
        String res = "";
        String temp = "";

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);

            if (c == 'G') {
                res += "G";
            } 

            else if (c == '(') {
                temp = "(";
            } 

            else if (c == ')') {
                temp += ")";
                if (map.containsKey(temp)) {
                    res += map.get(temp);
                }
                temp = "";
            } 
            
            else {
                temp += c;
                if (map.containsKey(temp)) {
                    res += map.get(temp);
                    temp = "";
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String res = interpret("G()(al)");
        System.out.println("Result: " + res);
    }
}
