package omg;

/**
 * Hello world!
 *
 */
public class OneAway
{
    public static void main(String[] args )
    {
        
    }

    public static boolean checkForOneEdit(String string1, String string2) {
        int matches = 0;
        for (int i = 0; i < string1.length(); i++) {
            String letter = Character.toString(string1.charAt(i));
            if(string2.contains(letter)){
                matches++;
            }
        }
        if (matches == (string1.length() - 1)){
            return true;
        } else {
            return false;
        }
        
    }
}