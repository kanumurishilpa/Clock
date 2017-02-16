package kanumuri.shilpa.clock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zipcoder on 2/16/17.
 */
public interface TimeValidatorAndParser {

    boolean validate(final String time);

    Time extractTimeFormat(String givenTime);

    String[] splitString(String stringToBeSplit);

}
