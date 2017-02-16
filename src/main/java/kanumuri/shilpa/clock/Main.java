package kanumuri.shilpa.clock;

/**
 * Created by zipcoder on 2/15/17.
 */
public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Time time;
        Time12HoursFormat time12hrFormat = new Time12HoursFormat();
        Time24HoursFormat time24HoursFormat = new Time24HoursFormat();
        EnglishNumberToWords numberToWords = new EnglishNumberToWords();

        System.out.println("Clock");
        String inputTime = input.readStringValues();

        if(time12hrFormat.validate(inputTime)){
           time = time12hrFormat.extractTimeFormat(inputTime);
           System.out.println( EnglishNumberToWords.convert(time.getHours()) + " hours and " + EnglishNumberToWords.convert(time.getMinutes()) + " minutes " + time.getAmOrpm());

        }if(time24HoursFormat.validate(inputTime)){
            time = time24HoursFormat.extractTimeFormat(inputTime);
            System.out.println( EnglishNumberToWords.convert(time.getHours()) + " hours and " + EnglishNumberToWords.convert(time.getMinutes()) + " minutes");
        }

    }

}
