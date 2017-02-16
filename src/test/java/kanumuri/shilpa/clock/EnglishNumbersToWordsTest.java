package kanumuri.shilpa.clock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/16/17.
 */
public class EnglishNumbersToWordsTest {

    EnglishNumberToWords numberToWords;

    @Before
    public void setUp(){
        numberToWords = new EnglishNumberToWords();
    }

    @Test
    public void convertTest(){
        boolean expected = true;
        String actual = EnglishNumberToWords.convert(1);
        Assert.assertTrue(actual.equals(" one"));
    }

    @Test
    public void convertTest2(){
        boolean expected = true;
        String actual = EnglishNumberToWords.convert(30);
        Assert.assertTrue(actual.equals(" thirty"));
    }

    @Test
    public void convertTest3(){
        boolean expected = true;
        String actual = EnglishNumberToWords.convert(35);
        Assert.assertTrue(actual.equals(" thirty five"));
    }

    @Test
    public void convertTest4(){
        boolean expected = true;
        String actual = EnglishNumberToWords.convert(0);
        Assert.assertTrue(actual.equals(""));
    }

    @Test
    public void convertTest5(){
        boolean expected = true;
        String actual = EnglishNumberToWords.convert(99);
        Assert.assertTrue(actual.equals(" ninety nine"));
    }
}
