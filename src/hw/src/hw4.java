import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
     //Login Functionality
     //Write a logic which would tell the user if logged in or not
     //you have a username
     //you have a password
     //you loginLocation

     //in order to be logged your userName should match steve@apple.com
     //and your password should be infinityLoop1
     //and you location should be california
        String username = "steve@apple.com";
        String password = "infinityLoop1";
        String location =  "california";
        boolean logIn = true;
        logIn = username.equals("steve@apple.com") && password.equals("infinityLoop1") && location.equals("california");
        System.out.println(logIn);
    }

    ///////////////////////


}
