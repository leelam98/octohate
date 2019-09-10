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
    @Test
    public void ReplaceMorseCodeWithSingleLetter(){
        String input = ".-..";
        String expected = "L";
        String actual = fromMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceMorseCodeWithGroupOfLetters(){
        String input = ".-.. -.-- ...";
        String expected = "LYS";
        String actual = fromMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceMorseCodeWithSingleWord(){
        String input = ".-.. .. .- --";
        String expected = "LIAM";
        String actual = fromMorse(input);
        assertEquals(expected, actual);
    }
    @Test 
    public void ReplaceMorseCodeWithTwoWords(){
        String input = ".... . .-.. .-.. ---   .-- --- .-. .-.. -..";
        String expected = "HELLO WORLD";
        String actual = fromMorse(input);
        assertEquals(expected, actual);
    }
}
