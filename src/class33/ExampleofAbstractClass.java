package class33;
abstract class Bank{
int balance;
    public abstract void displayRateofInterest();//abstract method
    public void withdraw(int amount){
        balance = balance-amount;
    }
}
class cityBank extends Bank{
    @Override
    public void displayRateofInterest(){
        System.out.println("5.0");
    }
}
class ChaseBank extends Bank{
    @Override
    public void displayRateofInterest(){
        System.out.println("6.0");
    }
}
public class ExampleofAbstractClass {
    public static void main(String[] args) {
        cityBank c = new cityBank();
        c.displayRateofInterest();
    }

}
