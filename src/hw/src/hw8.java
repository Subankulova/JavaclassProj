package hw.src;
import java.util.Scanner;
public class hw8 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        //homework: in Food ingredients app
        //handle invalid inputs:
        //if the user entered invalid input on Main course or Appetizer choice print "Invalid Choice"
        //if the user entered invalid input on Appetizer choice - print Invalid appetizer choice
        //if the user entered invalid input on Main course choice - print Invalid Main course choice

        //second part of homework
        //add Drinks choice
        //users should have Orange juice, Apple juice, pineapple juice
        //print out ingreditents for each.
        System.out.println("Please choose, what option do you prefer?");
        System.out.println("1. Appetizer or 2. Main course");
        String choice1 = sc.nextLine();
        if (choice1.equalsIgnoreCase("Appetizer") || choice1.equalsIgnoreCase("1")) {
            System.out.println("1. springrolls");
            System.out.println("2. eggrools");
            String choiceAppetizer = sc.nextLine();
            if (choiceAppetizer.equalsIgnoreCase("springrolls") || choiceAppetizer.equalsIgnoreCase("1")) {
                System.out.println("spring roll ingredients: inori, rice, fish");
            } else if (choiceAppetizer.equalsIgnoreCase("eggrolls") || choiceAppetizer.equalsIgnoreCase("2")) {
                System.out.println("egg roll ingredients: rice, egg, fish");
            } else System.out.println("Invalid appetizer choice. No such option in the menu.");
        }
        else if (choice1.equalsIgnoreCase("main") || choice1.equalsIgnoreCase("2")) {
            System.out.println("1. lagman");
            System.out.println("2. NY ribeye steak");
            String choiceMain = sc.nextLine();
            if (choiceMain.equalsIgnoreCase("lagman") || choiceMain.equalsIgnoreCase("1")) {
                System.out.println("Lagman ingredients: noodles, vegetables, meat");
            } else if (choiceMain.equalsIgnoreCase("ribeye steak") || choiceMain.equalsIgnoreCase("2")) {
                System.out.println("NY ribeye steak ingredients: meat, meat, meat");
            } else System.out.println("Invalid Main course choice. No such option in the menu.");
        }
        else System.out.println("Invalid Choice. No such option in the menu.");

        System.out.println("Please choose, what drink do you prefer?");
        System.out.println("1. Orange juice  2. Apple juice or 3. Pineapple juice");
        String choicedrinks = sc.nextLine();
        if (choicedrinks.equalsIgnoreCase("orange juice") || (choicedrinks.equalsIgnoreCase("1"))) {
            System.out.println("Here's your orange juice, ingredients: orange, soda, ice");
        } else if (choicedrinks.equalsIgnoreCase("apple juice") || (choicedrinks.equalsIgnoreCase("2"))) {
            System.out.println("Here's your apple juice, ingredients: apple, soda, ice");
        } else if (choicedrinks.equalsIgnoreCase("pineapple juice") || (choicedrinks.equalsIgnoreCase("3"))) {
            System.out.println("Here's your pineapple juice, ingredients: pineapple, soda, ice");
        } else System.out.println("Invalid Drinks choice. No such option in the menu.");


        System.out.println("HW 8.2================================");
        //Write a program for online shopping website:
        //An online shopping website uses a nested if statement to determine the shipping cost for an order based on the
        // weight of the order and the shipping destination.
        //Take user inputs for:
        //double weight, destination.
        //If the weight of the order is less than 2 lbs and the shipping destination is within the United States,
        // the shipping cost is $5.
        //If the weight of the order is 2 lbs or more and the shipping destination is within the United States,
        // the shipping cost is calculated based on the weight of the order. users pay 50 cents per lbs.
        //If the shipping destination is outside the United States, the shipping cost is calculated based
        // on the weight of the order at special rate. $1.5 per lbs.
        //Example output 1:
        //Please  Enter weight of your item in lbs
        //1
        //Please enter shipping country:
        //United States
        //Your shipping cost is $5
        //Example output 2:
        //Please  Enter weight of your item in lbs
        //20
        //Please enter shipping country:
        //United States
        //Your shipping cost is $10
        //Example output 3:
        //Please  Enter weight of your item in lbs
        //10
        //Please enter shipping country:
        //Canada
        //Your shipping cost is $15
        System.out.println("Let's place your order, fill out the details");
        System.out.println("Please Enter weight of your item in lbs");
        double weight = sc.nextDouble();
        System.out.println("Please enter shipping country");
        String country = sc.next();
        if (country.equalsIgnoreCase("USA")) {
            if (weight < 2) {
                System.out.println("Your shipping cost is $5");
            } else if (weight >= 2) {
                System.out.println("Your shipping cost is $ " + weight * 0.5);
            }
        } else System.out.println("Your shipping cost is $ " + weight * 1.5);


        System.out.println("HW 8.3================================");
        //Nested If statements homework 3:
        //Write a bank app to calculate interest rates on loans:
        //take input for loanAmount in $,  credit score between 300-850.
        //If the loan amount is less than $10,000 and the credit score is less than 600, the interest rate is set to 15%.
        //If the loan amount is less than $10,000 and the credit score is 600 or higher, the interest rate is set to 10%.
        //If the loan amount is $10,000 or higher and the credit score is less than 600, the interest rate is set to 12%.
        //If the loan amount is $10,000 or higher and the credit score is 600 or higher, the interest rate is set to 8%.
        //Print out the interest rate.
        //Example output:
        //Please enter how much you want to loan:
        //9000
        //Please enter your credit score:
        //750
        //Your interest rate is 10%.
        System.out.println("Please enter your credit details to see your interest rate");
        System.out.println("Please enter how much you want to loan: ");
        int loanAmount = sc.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = sc.nextInt();

        if (loanAmount < 10000 && creditScore > 0) {
            if (creditScore < 600) {
                System.out.println("Your interest rate is 15%");
            }
            else System.out.println("Your interest rate is 10%");}
        else if (loanAmount >= 10000 && creditScore > 0) {
            if (creditScore < 600) {
                System.out.println("Your interest rate is 12%");
            } else System.out.println("Your interest rate is 8%");
        }
        else System.out.println("we canot give you a loan");
        }
    }

