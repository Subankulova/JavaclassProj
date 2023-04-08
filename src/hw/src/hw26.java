package hw.src;
//Task 1:
//Create a class Food, VegFood, and Salad
//Create two constructors in each class
//Call the second constructor of each class from the first constructor using this() keyword
//Call the VegFood Class constructor from the Salad Class constructor using the super() keyword
//Call the Food class constructor from VegFood Class constructor using the super() keyword
//Create a MainClass and create an object of Salad Class & Execute the code without errors


class Food {
    Food(String name) {
        this("VegFood","FastFood");
    }
    Food(String name, String whatelse) {
        System.out.println("What food do you like?");
        System.out.println(name +" and " + whatelse);
    }
}
class VegFood extends Food{
    VegFood() {
        this("Greek Salad", false);
    }
    VegFood(String name, boolean withSalt) {
        super("VegFood");
        System.out.println("I like a " + name);
    }
}
class Salad extends VegFood{
    Salad() {
        this("feta cheese", 100);
    }
    Salad(String prod, int gr) {
        super();
        System.out.println("This Salad has a " + gr + " gram of " + prod);
    }
}

public class hw26 {
    public static void main(String[] args) {
        Salad b = new Salad();
    }
}

