package class30;

import java.util.Scanner;

class Browser {
    void openWebsite() {
        System.out.println("Opening website");
    }

    void doLogin() {
        System.out.println("Logging in");
    }

    void logout() {
        System.out.println("logging out");
    }
}

class Chrome extends Browser {
    void openWebsite() {
        System.out.println("Opening website in chrome");
    }

}

class FireFox extends Browser {
    void openWebsite() {
        System.out.println("Opening website in firefox");
    }
}

public class DynamicPolyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter browser");
        String browser = input.next();
        Browser br = null;

        if (browser.equalsIgnoreCase("chrome")) {
            br = new Chrome();
        } else if (browser.equalsIgnoreCase("firefox")) {
            br = new FireFox();
        } else {
            System.out.println("Invalid browser specified");
        }
        br.openWebsite();
        br.doLogin();
        br.logout();

    }
}
