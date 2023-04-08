package class10;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Please choose, what option do you prefer?");
        System.out.println("1. appetizer or 2. main");
        String choice1 = sc.nextLine();
        if(choice1.equalsIgnoreCase("appetizer") || choice1.equalsIgnoreCase("1")) {
            System.out.println("1springrolls");
            System.out.println("2eggrools");
            String choiceAppetizer = sc.nextLine();
            if(choiceAppetizer.equalsIgnoreCase("springrolls") || choiceAppetizer.equalsIgnoreCase("1")){
                System.out.println("spring roll ingredients");}
            else if(choiceAppetizer.equalsIgnoreCase("eggrolls") || choiceAppetizer.equalsIgnoreCase("2")) {
                System.out.println("egg roll ingredients");}
            }
        else if(choice1.equalsIgnoreCase("main") || choice1.equalsIgnoreCase("2")){
            System.out.println("1lagman");
            System.out.println("2ribeye");
            String choiceMain = sc.nextLine();
            if(choiceMain.equalsIgnoreCase("lagman") || choiceMain.equalsIgnoreCase("1")){
                System.out.println("Lagman ingredients");}
            else if(choiceMain.equalsIgnoreCase("ribeye") || choiceMain.equalsIgnoreCase("2")) {
                System.out.println("NY ribeye steak ingredients");}
        }
        else  System.out.println("There is not such option in menu");
            }
        }

