package class32;

public class ChaseBank {
    public int balance;

   public void withdraw(int amount) {
        balance = balance - amount;
    }

   public void deposit(int amount) {
        balance = balance + amount;
    }
}

class PurposeAccessModifier {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.deposit(5000);
//        cb.balance = 1000;
    }
}