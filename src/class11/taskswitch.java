package class11;

public class taskswitch {
    public static void main(String[] args) {
//Write a program to print the number of days in a given month using the Switch Statement
//Question Type: Write Code.
//Example
//Input - 1,  Output - 31 days
//Input - 2,  Output - 28/29 days
//Input - 3,  Output - 31 days
//Input - 4,  Output - 30 days
//Input - 5,  Output - 31 days
//Input - 6,  Output - 30 days
//Input - 7,  Output - 31 days
//Input - 8,  Output - 31 days
//Input - 9,  Output - 30 days
//Input - 10,  Output - 31 days
//Input - 11,  Output - 30 days
//Input - 12, Output - 31 days

        int day = 0;
        switch (day) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
