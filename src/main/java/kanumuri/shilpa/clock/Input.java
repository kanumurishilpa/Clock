package kanumuri.shilpa.clock;

import java.util.Scanner;

/**
 * Created by zipcoder on 2/15/17.
 */
public class Input {

    public String readStringValues(){
        System.out.println("Give me a time : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
