package hw.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Create an enum of days ( Sunday(0) to Saturday(6) ) and attached an int number to it (0 to 6)
//Take a day number from the user from 0 to 6
//Print associate day in the output
enum Days {
    SUNDAY(0), MONDAY(1), THURSDAY(2), WEDNESDAY(3), TUESDAY(4), FRIDAY(5), SATURDAY(6);
    int num;
    Days(int num) {
        this.num = num;
    }
}

public class hw32 {
    public static void main(String[] args) {
        System.out.println("What is the day today? enter number  from 0 to 6");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        Days dayName = Days.values()[day];
        if (day < 0 && day > 6) {
            System.out.println("Please try again");
        } else if (day == 0 || day == 6) {
            System.out.println("Today is a day off " + dayName);
        } else {
            System.out.println("Today is a weekday " + dayName);
        }

    }

}
