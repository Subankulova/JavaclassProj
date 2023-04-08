package class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PurposeofException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = sc.next();

        if(browser.equals("firefox")){
            System.out.println("Opening firefox");}
            else if (browser.equals("chrome")){
                System.out.println("Opening chrome");
            }
            else {
                throw new InputMismatchException("Invalid");
            }
        System.out.println("Opening login page");
        System.out.println("Doing login");
        }
    }

