import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //**Write a program to take a day number from the user and print the name of the day from the given number**
        //**Question Type:** Write Code.
        //## Test Data:
        //```java
        //Input - 0,  Output - Sunday
        //Input - 1,  Output - Monday
        //Input - 2,  Output - Tuesday
        //Input - 3,  Output - Wednesday
        //Input - 4,  Output - Thursday
        //Input - 5,  Output - Friday
        //Input - 6,  Output - Saturday
        //Input - 7,  Output - Invalid Input

        System.out.println("please enter the name of the week day in number");
        int day = input.nextInt();
        if (day==0){
            System.out.println("It is Sunday");
        }
        else if (day==1){
            System.out.println("It is Monday");
        }
        else if (day==2){
            System.out.println("It is Tuesday");
        }
        else if (day==3){
            System.out.println("It is Wednesday");
        }
        else if (day==4){
            System.out.println("It is Thusrday");
        }
        else if (day==5){
            System.out.println("It is Friday");
        }
        else if (day==6){
            System.out.println("It is Saturday");
        }
        else
            System.out.println("Invalid Input");


        System.out.println("==================Task2");

        //**Write a program to print a welcome message to the traveler and notify
        // them of a 10% discount if they are returning customers, at the end print
        // the message “Enjoy your stay here”**
        //Example 1:
        //Welcome to the Beverly Hills
        //Are you traveling first time here(true/false)? true
        //Enjoy your stay

        //Example 2:
        //Welcome to the Beverly Hills
        //Are you traveling first time here(true/false)? false
        //You have got a 10% discount on your stay
        //Enjoy your stay

        System.out.println("Welcome to the Beverly Hills! Are you traveling first time here(true/false)?");
        boolean answer = input.nextBoolean();
        if (answer) {
            System.out.println("Enjoy your stay!");
        }
        else
            System.out.println("You have got a 10% discount on your stay. Enjoy your stay!");


    }
}


