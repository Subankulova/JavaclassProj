package hw.src;
//Task 1:
//Create a class called Page & have 2 methods loadPage() & isPageLoaded()
//Create a no argument Constructor in the Page class & print message in the Constructor
//Create a child class called LoginPage that extends Page class
//Create methods - doLogin(), logout() in the LoginPage
//Create a child class HomePage that extends Page class
//Create methods - openHomePage(), verifyLogo() in the HomePage
//Create MainClass
//Create an object of LoginPage and call method doLogin() and logout()
//Create an object of HomePage and call method openHomePage(), verifyLogo()

class Page {
    Page() {
        System.out.println("Welcome to our Page!");
    }

    void loadPage() {
        System.out.println("Page is loading");
    }

    void isPageLoaded() {
        System.out.println("Page is loaded");
    }
}
class loginPage extends Page {
    void doLogin() {
        System.out.println("Log in ");
    }

    void logout() {
        System.out.println("Log out");
    }
}

class HomePage extends Page {
    void openHomepage() {
        System.out.println("Welcome to Home page ");
    }

    void verifyLogo() {
        System.out.println("Your logo is verified");
    }
}
public class hw25 {
    public static void main(String[] args) {
        loginPage a = new loginPage();
        a.doLogin();
        a.logout();
        HomePage b = new HomePage();
        b.openHomepage();
        b.verifyLogo();


    }
    }


