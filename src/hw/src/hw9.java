package hw.src;


import java.util.Scanner;

public class hw9 {
    public static void main(String[] args) {
        //Write a program that takes a day of the week as input (e.g., “Monday”),
        // and outputs the number of days until the next weekend (i.e., either Saturday or Sunday).
        // Use a switch statement to implement this program.
        //Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"

        Scanner sc = new Scanner(System.in);


        System.out.println("Task1===========");

        System.out.println("How many days left until the weekend? please write today's day");
        String day = sc.next();
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("5 days");
                break;
            case "tuesday":
                System.out.println("4 days");
                break;
            case "wednesday":
                System.out.println("3 days");
                break;
            case "thursday":
                System.out.println("2 days");
                break;
            case "friday":
                System.out.println("1 day");
                break;
            case "saturday":
                System.out.println("Today is the day off. But 7 days until the next weekend");
                break;
            case "sunday":
                System.out.println("Today is the day off. But 6 days until the next weekend");
                break;
            default:
                System.out.println("Please try again!");
        }

        System.out.println("Task 2 ===============");

        //2. Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two integers as input,
        // and outputs the result of the operation. Use a switch statement to implement this program.
        // Make sure to consider the possibility of division by zero, and any other edge cases.
        //Sample outputs for input "+ 2 3" would be "5", input "/ 6 2" would be "3", input "* 7 8" would be "56",
        // if we have edge case input "/ 5 0" would be "division by zero is not allowed" or similar message

        System.out.println("Please write first number");
        double num1 = sc.nextDouble();
        System.out.println("Please enter an operator: (*,+,-,/) ");
        char op = sc.next().charAt(0);
        System.out.println("Please write second number");
        double num2 = sc.nextDouble();

        switch(op){
            case '+':
                System.out.println("result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("result: " + num1 * num2);
                break;
            case '/':
                if(num2==0){
                    System.out.println("division by zero is not allowed");
                }
                System.out.println("result: " + num1 / num2);
                break;
            default:
                System.out.println("Wrong operator");
        }






    }
}
