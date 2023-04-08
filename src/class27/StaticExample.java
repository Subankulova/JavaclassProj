package class27;
//inside the static method we can use only static variables
class Car{
    int speed =200;//instance
    static int price = 600;
    void drive(){
        int speed =100;//local
        System.out.println(speed);
    }
}
public class StaticExample {
    public static void main(String[] args) {
       Car c = new Car();
//        System.out.println(speed);//error
        System.out.println(c.speed);//200
//        System.out.println(Car.speed);//error
        System.out.println(Car.price);//600
        System.out.println(c.price);//600
    }
}
