package hw.src;

public class hw24Class {
    //Task 1:
    //Write a program to create a Bank Class with Static and Instance variables inside it. (Brainstorm on which variables can be static in Bank Class )
    //Create static as well as non-static methods inside the bank class that can utilize variables of class
    //Create a BankMainClass and call the instance method of the class using the object & static method using class
    static int balance = 5000;
    int date;
    hw24Class(int dateFromUser){
        date = dateFromUser;
    }
    void montlySalary (int income){
        balance = balance+income;
    }
    static void monthlyCredit (int credit){
        balance = balance-credit;
    }
}
