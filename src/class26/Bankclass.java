package class26;

public class Bankclass {
    String accName;
    double balance;
    String accNumber;

    Bankclass(String accNameFromUser, String accNumberFromUser){
        balance = 0;
        accName = accNameFromUser;
        accNumber = accNumberFromUser;
    }

    Bankclass(){
        System.out.println("From no Arg constr");
    }

    void deposit(int amount){
        System.out.println(accName + " is trying to deposit " + amount + " into " + accNumber);
        balance = balance+amount;
    }
    void withdraw(int amount){
        System.out.println(accName + " is trying to withdraw " + amount + " into " + accNumber);
        balance = balance-amount;
    }
}
