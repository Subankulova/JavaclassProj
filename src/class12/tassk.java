package class12;

import java.util.Scanner;

public class tassk {
    public static void main(String[] args) {
        boolean result = Trouble(false, 6);
        System.out.println(result);

        //We have a loud talking parrot.
        // Create a function that will tell us if we are in trouble
        // or not based on the hour and based on if the parrot is talking.
        //The "hour" is the current hour time in the range 1..24.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        // Return true if we are in trouble.
    }

    public static boolean Trouble(boolean talking, int hour) {
        if (talking && (hour > 7 || hour < 20))
        {
            return true;
        }
        else {
            return false;
        }

    }

}
