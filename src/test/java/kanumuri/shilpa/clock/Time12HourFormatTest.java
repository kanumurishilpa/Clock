package kanumuri.shilpa.clock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/16/17.
 */
public class Time12HourFormatTest {

    private Time12HoursFormat time12HoursFormat;

    @Before
    public void initData(){
        time12HoursFormat = new Time12HoursFormat();
    }


    @Test
    public void ValidTime12HoursTest() {
        boolean valid = time12HoursFormat.validate("1:00am");
        System.out.println("Time12Hours is valid : " + "1:00am" + " , " + valid);
        Assert.assertEquals(true, valid);
    }

    @Test
    public void InValidTime12HoursTest() {
        boolean valid = time12HoursFormat.validate("1:61 pm");
        System.out.println("Time12Hours is valid : " + "1:61 pm" + " , " + valid);
        Assert.assertEquals(false, valid);
    }

    @Test
    public void splitStringTest(){
        String[] expected = {"11", "25", "am"};
        String[] actual = time12HoursFormat.splitString("11:25am");
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void test12HourFormat(){
        Time expected = new Time(3,30,"pm");
        Time actual = time12HoursFormat.extractTimeFormat("3:30pm");
        Assert.assertEquals(expected,actual);
    }


}
