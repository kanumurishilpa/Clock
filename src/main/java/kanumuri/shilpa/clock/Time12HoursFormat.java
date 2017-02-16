package kanumuri.shilpa.clock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by zipcoder on 2/16/17.
 */
public class Time12HoursFormat implements TimeValidatorAndParser{

    private Pattern pattern;
    private Matcher matcher;
    Time time;
    String[] splitterString;

    private static final String TIME12HOURS_PATTERN =
            "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";

    public Time12HoursFormat(){
        pattern = Pattern.compile(TIME12HOURS_PATTERN);
    }

    public boolean validate(final String time){
        matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public Time extractTimeFormat(String givenTime){
        String[] splitString;
        splitString = splitString(givenTime);
        time = new Time(Integer.parseInt(splitString[0]),Integer.parseInt(splitString[2]),splitString[3]);
        return time;
    }

    public String[] splitString(String stringToBeSplit){
        splitterString = stringToBeSplit.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for (String s : splitterString) {
            System.out.println(s);
        }
        return splitterString;
    }

}
