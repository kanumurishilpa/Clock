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

    public void print(){
        System.out.println(hours);
        System.out.println(minutes);
        //System.out.println(amOrpm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;

        Time time = (Time) o;

        if (hours != time.hours) return false;
        if (minutes != time.minutes) return false;
        return amOrpm.equals(time.amOrpm);
    }


}
