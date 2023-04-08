import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = input.next();
        System.out.println("Your username is " + username);
        System.out.println("Please enter your password");
        String password = input.next();
        System.out.println("Your password is " + password);
        boolean passw;
        passw = username.equalsIgnoreCase("Best@devx.com") && password.equalsIgnoreCase("falL2022");
        System.out.println(passw);





    }
}
