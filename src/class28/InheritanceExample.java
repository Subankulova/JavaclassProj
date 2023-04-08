package class28;
class Calculator{//parent class
    void add(int a, int b){
        System.out.println(a+b);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
    }
class AdvanceCalculator extends Calculator{//child class
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        System.out.println(a/b);
    }

}
public class InheritanceExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.sub(40,20);
        AdvanceCalculator ac = new AdvanceCalculator();
        ac.mul(40,2);
        ac.div(40,20);
        ac.add(10,20);
        ac.sub(40,20);

    }
}
