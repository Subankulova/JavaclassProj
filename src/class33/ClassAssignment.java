package class33;
abstract class Food{
    public abstract void meat();
    public abstract void salt();
    void oil(){
        System.out.println("Food is preparing in a oil");
    }
    void hotMeal(){
        System.out.println("It is hot meal");
    }

}
class Plov extends Food{
    @Override
    public void meat() {
        System.out.println("Plov has meat");
    }

    @Override
    public void salt() {
        System.out.println("Plov has salt");
    }
}
public class ClassAssignment {
    public static void main(String[] args) {
        Plov a = new Plov();
        a.hotMeal();
        a.oil();
        a.meat();
        a.salt();
    }
}
