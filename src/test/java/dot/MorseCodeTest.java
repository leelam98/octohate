package dot;

import org.junit.Test;
import static org.junit.Assert;

public class MorseCodeTest{
    @Test
    public void ReplaceSingleLetterWithMorseCode(){
        String input = "L";
        String expected = ".-..";
        String actual = toMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceGroupofLettersWithMorseCode(){
        String input = "LYS";
        String expected = ".-.. -.-- ...";
        String actual = toMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceSingleWordWithMorseCode(){
        String input = "LIAM";
        String expected = ".-.. .. .- --";
        String actual = toMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceTwoWordsWithMorseCode(){
        String input = "HELLO WORLD";
        String expected = ".... . .-.. .-.. ---   .-- --- .-. .-.. -..";
        String actual = toMorse(input);
        assertEquals(expected, actual);
    }
}
