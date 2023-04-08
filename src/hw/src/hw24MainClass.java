package hw.src;

public class hw24MainClass {
    public static void main(String[] args) {
        hw24Class taira = new hw24Class(28);
        taira.montlySalary(30000);
        System.out.println("Taira on " + taira.date + " got a salary, and now she's balance is " + taira.balance);
        hw24Class.monthlyCredit(5000);
        System.out.println("After paying credit Taira has a money in a balance " + hw24Class.balance);
    }
}
