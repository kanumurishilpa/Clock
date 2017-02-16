package kanumuri.shilpa.clock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/16/17.
 */
public class Time24HourFormatTest {

    private Time24HoursFormat time24HoursFormat;

    @Before
    public void initData(){
        time24HoursFormat = new Time24HoursFormat();
    }


    @Test
    public void ValidTime24HoursTest() {
        boolean valid = time24HoursFormat.validate("13:00");
        System.out.println("Time24Hours is valid : " + "13:00" + " , " + valid);
        Assert.assertEquals(true, valid);
    }

    @Test
    public void InValidTime24HoursTest() {
        boolean valid = time24HoursFormat.validate("1:61");
        System.out.println("Time24Hours is valid : " + "1:61" + " , " + valid);
        Assert.assertEquals(false, valid);
    }

    @Test
    public void splitStringTest(){
        String[] expected = {"11", "25"};
        String[] actual = time24HoursFormat.splitString("11:25");
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void test24HourFormat(){
        Time expected = new Time(3,30);
        Time actual = time24HoursFormat.extractTimeFormat("3:30");
        Assert.assertEquals(expected,actual);
    }

}
