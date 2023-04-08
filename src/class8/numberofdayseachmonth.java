import java.util.Scanner;

public class numberofdayseachmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month in number");
        int month = input.nextInt();
        if (month==1||month==3||month==5||month==7||month==8||month==12){
            System.out.println("in month 31 days");
        }
        else if (month==6||month==4||month==9||month==11){
            System.out.println("in month 30 days");
        }
        else if (month==2){
            System.out.println("in month 29 or 28 days");
        }
        else
            System.out.println("that's wrong!");



    }
}
