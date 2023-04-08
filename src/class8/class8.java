package class8;

import java.util.Scanner;

public class class8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //3. Write a program to print a welcome message to the passenger and
        //notify them to do security checks if they are not coming from connecting flight,
        //and at the end print "Please proceed to the security check, enjoy your flight"

        System.out.println("Are you travelling from connecting flight?");
        String answer = input.nextLine();
        if (answer.equals(answer)) {
            System.out.println("Please proceed to the security check!");
        }
        System.out.println("enjoy your fligh!");


        /* boolean a = false;
        if (!a) {
            System.out.println("Hi");
        }*/





    }
}