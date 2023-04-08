package hw.src;

//Create an abstract class called Car
//create one abstract, one non-abstract, and one static method in the abstract class
//Create a child class & override parent class abstract methods
//Create a MainClass
//Create an object of the child class with reference of the parent class
//Call all three methods
abstract class Car {
    abstract void drive();
    void repair() {
        System.out.println("It no needs to be repaired");
    }

    static void speedMax(int speedMax) {
        System.out.println("The Maximum speed of the Car is " + speedMax+" km/hour");
    }
}
class Mersedes extends Car{
    @Override
    void drive(){
        System.out.println("The car is good for driving");
    }
}

public class hw30 {
    public static void main(String[] args) {
        Car mers = new Mersedes();
        mers.drive();
        mers.repair();
        mers.speedMax(200);
    }
}
