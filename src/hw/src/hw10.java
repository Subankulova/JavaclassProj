package hw.src;
import java.util.Scanner;
public class hw10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a method that takes a person's height as a double (in meters)
        // and returns their height in feet and inches. Google the formula
        /*System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();
        humanHeight(height); */

        /*System.out.println("Enter your grade: "); //task 2
        String grade = sc.next();
        yourGrade(grade);*/
        System.out.println("You are a member of a loyalty program.");
        boolean loyalty = sc.nextBoolean();
        System.out.println("Your cost of a purchase? ");
        double cost = sc.nextDouble();
        loyaltyProgram(loyalty,cost);
    }

            public static void loyaltyProgram (boolean loyalty, double cost){
                double discount = cost*0.1;
                if(loyalty){
                    System.out.println("Your cost is $" + (cost - discount) + " with 10% discount");
                }
                else System.out.println("Your cost is $" + cost);

        }

    }




