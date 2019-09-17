package dot;

import java.util.HashMap;
import java.util.Map;

public class MorseCode{
    public static void main(String[] args){
        String methodType = args[0];
        String input = args[1];
        if(methodType == "to_morse"){
            toMorse(input);
        }
        if (methodType == "from_morse") {
            //fromMorse(input)
        }
    }

    final static String[][] code = {
        {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},
        {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."},
        {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},
        {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."},
        {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
        {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
        {"Y", "-.--"}, {"Z", "--.."}, {"0", "-----"}, {"1", ".----"},
        {"2", "..---"}, {"3", "...--"}, {"4", "....-"}, {"5", "....."},
        {"6", "-...."}, {"7", "--..."}, {"8", "---.."}, {"9", "----."},
        {"'", ".----."}, {":", "---..."}, {",", "--..--"}, {"-", "-....-"},
        {"(", "-.--.- "}, {".", ".-.-.- "}, {"?", "..--.. "}, {";", "-.-.-."},
        {"/", "-..-."}, {"-", "..--.-"}, {")", "---.."}, {"=", "-...-"},
        {"@", ".--.-."}, {"\"", ".-..-."}, {"+", ".-.-."}};

    final static Map<Character, String> to_map = new HashMap<>();

    final static Map<String, Character> from_map = new HashMap<>();

    static {
        for (String[] pair : code)
            to_map.put(pair[0].charAt(0), pair[1]);
    }

    static {
        for (String[] pair : code)
            from_map.put(pair[1], pair[0].charAt(0));
    }

    static String toMorse(String input) {
        String output = "";
        input = input.trim().toUpperCase();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
              output = output.substring(0, output.length() - 1);
              output = output.concat("   ");
            } else {
              String s = to_map.get(c);
              if (s != null) {
                output = output.concat(s + " ");
              }
            }
        }
        return output.substring(0, output.length() - 1);
    }
}
