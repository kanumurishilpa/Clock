package kanumuri.shilpa.clock;

/**
 * Created by zipcoder on 2/15/17.
 */
public class Time {
    private int hours;
    private int minutes;
    private String amOrpm;

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, String amOrpm){
        this.hours = hours;
        this.minutes = minutes;
        this.amOrpm = amOrpm;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getAmOrpm() {
        return amOrpm;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", amOrpm='" + amOrpm + '\'' +
                '}';
    }
}
