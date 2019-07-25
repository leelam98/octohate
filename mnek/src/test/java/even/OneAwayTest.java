package even;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple App.
 */
public class OneAwayTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrueNeedsInsertion()
    {
        String inputString1 = "pale";
        String inputString2 = "ple";
        Boolean actual = OneAway.checkForOneEdit(inputString1, inputString2);
        assertEquals(true, actual);
    }

    @Test
    public void shouldAnswerWithTrueNeedsRemoval()
    {
        String inputString1 = "pales";
        String inputString2 = "pale";
        Boolean actual = OneAway.checkForOneEdit(inputString1, inputString2);
        assertEquals(true, actual);
    }

    @Test 
    public void shouldAnswerWithTrueNeedsReplacement()
    {
        String inputString1 = "pale";
        String inputString2 = "bale";
        Boolean actual = OneAway.checkForOneEdit(inputString1, inputString2);
        assertEquals(true, actual);
    }
}
