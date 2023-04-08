import java.util.Scanner;

public class hwifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Ask the user how many Java exercises are you solving per day?
        //if it's less than 3 -> print out -> You are too lazy!
        //if it's more than or equal 3 and less than 5-> good job, but you should do better!
        //if it's more than or equal 5 than print out -> great job! You are on the right track!
        System.out.println("How many Java exercises are you solving per day ");
        int exercises = input.nextInt();
        if (exercises<3){
            System.out.println("You are too lazy!");
        }
        if (exercises>=3 && exercises <5){
            System.out.println("good job, but you should do better!");
        }
        if (exercises>=5){
            System.out.println("great job! You are on the right track!");
        }




        System.out.println("==================task2");
        //2. Write a Java program that takes three positive integer numbers from the
        //user as input to calculate and output the average of those three numbers.
        //Input 1: 5
        // Input 2: 10
        //Input 3: 15
        System.out.println("Please enter three integer numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("average of your numbers is  " + (num1 + num2 + num3)/3);

        System.out.println("==================task3");
        //3. Write a program to print a welcome message to the passenger and
        //notify them to do security checks if they are not coming from connecting flight,
                //and at the end print "enjoy your flight"
        System.out.println("Welcome to the Delta Air Lines! Are you travelling from connecting flight(true/false)?");
        Boolean flight = input.nextBoolean();
        if (flight.equals(true)){
            System.out.println("Enjoy your flight!");
        } else {
            System.out.println("Please proceed to the security check");
        }




    }



}

