package kanumuri.shilpa.clock;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by zipcoder on 2/16/17.
 */
public class Time24HoursFormat implements TimeValidatorAndParser{

    private Pattern pattern;
    private Matcher matcher;
    Time time;
    String[] splitterString;

    private static final String TIME24HOURS_PATTERN =
            "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    public Time24HoursFormat(){
        pattern = Pattern.compile(TIME24HOURS_PATTERN);
    }

    public boolean validate(final String time){
        matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public Time extractTimeFormat(String givenTime){
        String[] splitString;
        splitString = splitString(givenTime);
        time = new Time(Integer.parseInt(splitString[0]),Integer.parseInt(splitString[1]));
        return time;
    }

    public String[] splitString(String stringToBeSplit){
        splitterString = stringToBeSplit.split(":");
        return splitterString;
    }



}
