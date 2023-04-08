import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Write a credit landing program
        //get user input for age, creditscore, marital status
        //printout Approved: true
        //if user is older than 25
        //if user has a creditscore more than 700
        //if user is married

        //printout Approved: false
        // if any of the conditions is wrong
        System.out.println("Your age please: ");
        int age = input.nextInt();
        System.out.println("Your age: " + age);
        System.out.println("Your credit score please: ");
        double creditscore = input.nextDouble();
        System.out.println("Your creditscore: " + creditscore);
        System.out.println("Your marital status please: ");
        String maritalstatus = input.next();
        System.out.println("Your marital status: " + maritalstatus);
        if (age >=25 && creditscore >=700 && maritalstatus.equals("married")) {
            System.out.println("Approved: true");
        }
            else {
                System.out.println("Approved: false");
            }

        }



}
