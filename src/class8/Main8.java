package class8;

public class Main8 {
    public static void main(String[] args) {
        int age = 25;
        boolean giveDiscount = age > 60 || age < 8;
        System.out.println (giveDiscount);


        //drink coffee will be true if current time is 6-11
        int currenttime = 13;
        boolean drinkcoffee = currenttime>=5 || currenttime<=11;
        System.out.println (drinkcoffee);

        //tell me when i can start to relax
        //when you completed 5 exercises
        //or when you recorded 2 sofftskills videos
        int howmanyJavaex = 0;
        int softskillsvid = 0;
        boolean canIrelaxnow = howmanyJavaex >= 5 || softskillsvid >=2;
        System.out.println (canIrelaxnow);

        //banking industry application
        //when should the bank account be blocked?
        //loginAttempts more than 3
        //transaction amount is more than $3000
        //location of transaction -> must match your current location

        int numberofloginAttempts = 0;
        double transactionamount = 0.0;
        String locationoftransaction = "USA";

        boolean block = numberofloginAttempts >=3 || transactionamount >=3000 || locationoftransaction !="USA";
        System.out.println (block);


    }
}