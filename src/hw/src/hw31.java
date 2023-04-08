package hw.src;
//Take the InterfaceDemo Class from today's class and implement two more browsers Edge and Safari

import java.util.Scanner;

interface Browser {
    void openBrowser();

    void viewHistory();

    void openURL();
}

class Chrome implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Chrome view history");
    }

    @Override
    public void openURL() {
        System.out.println("Chrome open url");
    }

}

class Firefox implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Firefox Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Firefox View History");
    }

    @Override
    public void openURL() {
        System.out.println("Firefox Open url");
    }

}

class Edge implements Browser {
    @Override
    public void openBrowser() {
        System.out.println("Edge Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Edge view history");
    }

    @Override
    public void openURL() {
        System.out.println("Edge open url");
    }

}

class Safari implements Browser {
    @Override
    public void openBrowser() {
        System.out.println("Safari Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Safari view history");
    }

    @Override
    public void openURL() {
        System.out.println("Safari open url");
    }
}

public class hw31 {
    public static void main(String[] args) {
        System.out.println("Please enter your browser");
        Scanner input = new Scanner(System.in);
        String browserFromUser = input.nextLine();

        Browser browser = null;

        if (browserFromUser.contains("Chrome")) {
            browser = new Chrome();
        } else if (browserFromUser.contains("Firefox")) {
            browser = new Firefox();
        } else if (browserFromUser.contains("Edge")) {
            browser = new Edge();
        } else if (browserFromUser.contains("Safari")) {
            browser = new Safari();
            browser.openBrowser();
            browser.openURL();
            browser.viewHistory();
        }
    }
}
