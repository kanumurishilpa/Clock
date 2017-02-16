package kanumuri.shilpa.clock;

/**
 * Created by zipcoder on 2/15/17.
 */
public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Time12HoursFormat timeFormat = new Time12HoursFormat();

        System.out.println("Clock");
        String time = input.readStringValues();
        Time time1 = timeFormat.extractTimeFormat(time);
        System.out.println(time1);

    }

}
