package class2;

public class conditional {
    public static void main(String[] args) {


        boolean givecertificate = false;
        double aichgpa = 4.0;
        int sezimmissedclass = 2;

        givecertificate = aichgpa>3.5 && sezimmissedclass < 3;
        System.out.println (givecertificate);

        boolean issuedrivelicence = true;
        int age = 27;
        boolean haveapapssport = true;

        issuedrivelicence = age<16 && haveapapssport;
        System.out.println (issuedrivelicence);





    }
}
