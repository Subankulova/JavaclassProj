package class31;

public class BankMain {
    public static void main(String[] args) {
        Bank b = new ChaseBank();
        b.displayRateofInterest();
        b.deposit();
        b.withdraw();
    }
}
