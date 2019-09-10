package dot;

import java.util.*;

public class MorseCode{
    public static void main(String[] args){
        toMorse(args);
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
        {"@", ".--.-."}, {"\"", ".-..-."}, {"+", ".-.-."}, {" ", "   "}};
 
    final static Map<Character, String> map = new HashMap<>();


    static void toMorse(String input) {
        System.out.printf("%s %n", input);
 
        input = input.trim().replaceAll("[ ]+", " ").toUpperCase();
        for (char c : input.toCharArray()) {
            String s = map.get(c);
            if (s != null)
                System.out.printf("%s ", s);
        }
        System.out.println("\n");
    }
}
