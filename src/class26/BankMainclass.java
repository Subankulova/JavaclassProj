package class26;

import java.util.Scanner;

public class BankMainclass {
    public static void main(String[] args) {
        Bankclass acc1 = new Bankclass("Alina","12345");
//        acc1.initData("Chirag", "12345");
        acc1.deposit(1000);
        Bankclass acc2 = new Bankclass("Devx", "123");
        acc2.withdraw(500);


    }
}
