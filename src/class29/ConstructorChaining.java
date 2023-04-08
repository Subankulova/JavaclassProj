package class29;
class Vehicle{
    Vehicle(){
        System.out.println("From Vehicle");
    }
}
class Car extends Vehicle{

}
class SportsCar extends Vehicle{
    SportsCar(){
        System.out.println("From SportsCar");
    }

}
public class ConstructorChaining {
    public static void main(String[] args) {

        SportsCar sportscar = new SportsCar();
    }
}
