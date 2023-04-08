package class34;

import java.util.Scanner;

interface Browser{
    void openBrowser();
    void viewHistory();
    void openURL();

}
interface MobileBrowser extends Browser{
    void shareURLviaWhatsApp();
    void rotate();
}
interface WebBrowser extends Browser{
    void inspectElement();
    void printPage();

}
class ChromeWeb implements WebBrowser{
    @Override
    public void openBrowser() {
        System.out.println("ChromeWeb open");
    }
    @Override
    public void viewHistory() {
    }
    @Override
    public void openURL() {
    }
    @Override
    public void inspectElement() {
    }
    @Override
    public void printPage() {

    }
}
class FirefoxWeb implements WebBrowser{
    @Override
    public void openBrowser() {
    }
    @Override
    public void viewHistory() {
    }
    @Override
    public void openURL() {
    }
    @Override
    public void inspectElement() {
    }
    @Override
    public void printPage() {
    }
}
class ChromeMobile implements MobileBrowser{
    @Override
    public void openBrowser() {
    }
    @Override
    public void viewHistory() {
    }
    @Override
    public void openURL() {
    }
    @Override
    public void shareURLviaWhatsApp() {
    }
    @Override
    public void rotate() {
    }
}



public class interfaceDemo {
    public static void main(String[] args) {
        System.out.println("Please enter your browser");
        Scanner sc = new Scanner(System.in);
        String browserFromUser = sc.next();
        Browser browser = null;

        if (browserFromUser.contains("Mobile")){
            Browser mobile = new ChromeMobile();
//            mobile.openBrowser();
//            mobile.shareURLviaWhatsApp();
//            mobile.rotate();
//            mobile.openURL();
//            mobile.viewHistory();
        }else if(browserFromUser.contains("Web")){
            WebBrowser webbrowser = null;
            if(browserFromUser.contains("Chrome")){
                webbrowser = new ChromeWeb();
            }else{
                webbrowser = new FirefoxWeb();
            }
            webbrowser.openBrowser();
            webbrowser.openURL();
            webbrowser.viewHistory();
        }

    }
}
