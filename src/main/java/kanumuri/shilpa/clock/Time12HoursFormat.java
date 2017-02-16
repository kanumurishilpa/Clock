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

        if(validate(givenTime) == true){
            splitString = splitString(givenTime);
            for(String s : splitString){
                System.out.println(s);
            }
            time = new Time(Integer.parseInt(splitString[0]),Integer.parseInt(splitString[1]),splitString[2]);
        }
        return time;

    }

    public String[] splitString(String stringToBeSplit){
        splitterString = stringToBeSplit.split("(\\s)(?=([01]?\\d:[0-6]?\\d\\s?([Aa]|[Pp])[Mm]))");
        return splitterString;
    }

}