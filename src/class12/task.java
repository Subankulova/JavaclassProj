package class12;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("where do you want to travel? ");
        String country = sc.next();
        travel(country);


    }

    public static void travel(String country) {
        System.out.println("I want to travel to " + country);

    }

    //Create a function that return true or false and will let us know if we can sleepIn.
//it should take 2 params - one to know if's a weekday
//another param to know if it's a vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean vacation , boolean weekday) {
        if (vacation) {
            return true;
        }
        return false;
    }


}
